package com.gysoft.thread;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author 魏文思
 * @date 2019/11/6$ 16:26$
 */
public class ThreadTest {


    /**
     * 1.SynchrousQueue 不会保存提交任务，超出直接corePoolSize个任务，
     * 直接创建新的线程来执行任务，直到(corePoolSize＋新建线程)> maximumPoolSize。不是核心线程就是新建线程。
     */
    /**Executors.newCachedThreadPool();  corePoolSize =0
     * newCachedThreadPool这个线程池  底层使用的是SynchrousQueue
     * 应用场景:如果编写的是小程序，或者轻量负载的服务器。使用这个是不错的选择，因为它不需要配置，并且一般情况下能够正确的完成工作，
     * 但是对于大负载服务器来说，缓存的线程池就不是很好的选择了。如果任务过多会一直创建线程，导致服务器负载太重，cpu都完全被占用了，线程越多情况越遭。
     * 2.Executors.newFixedThreadPool()  这个线程池使用的是LinkedBlockingQueue  无界队列，所有线程都会被执行完
     * Executors.newSingleThreadExecutor() 底层也是LinkedBlockingQueue
     * 3.ArrayBlockingQueue  有界队列  超过核心线程数的时候会让线程再队列里进行等待，
     * 当线程数>核心线程数+队列线程数会创建新的线程，当所有线程数大于max线程数的时候会被拒绝
     * 4. Executors.newScheduledThreadPool()  底层使用的是 DelayedWorkQueue
     * DelayedWorkQueue  属于阻塞队列  保证元素按照优先级排序
     * 保证添加到队列中的任务，会按照任务的延时时间进行排序，延时时间少的任务首先被获取。
     */
    /**
     * 测试demo核心 2 最大 3 正常来说说队列里只能存储一个，超过1个如果时间大于30秒则会请求申请增加工作线程，
     * 工作线程最大，如果再有线程将会根据拒绝策略进行处理
     * 现在配置的是SynchronousQueue这个队列有线程就创建
     */


    public static void main(String[] args) {
        queue();
    }

    /***
     * 执行不同的缓存队列
     */
    private static void queue() {
        syncQueue();
        //arrayQueue();
        //linkedQueue();
    }

    /**
     * ArrayBlockingQueue
     */
    private static void arrayQueue() {
        System.out.println("\n\n =======ArrayBlockingQueue====== \n\n");
        Executor executors = new ThreadPoolExecutor(
                2, 3, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2),
                new RejectHandler());
        execute(executors);
    }

    /**
     * LinkedBlockingQueue
     */
    private static void linkedQueue() {
        System.out.println("\n\n =======LinkedBlockingQueue====== \n\n");
        Executor executors = new ThreadPoolExecutor(
                2, 3, 30, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(),
                new RejectHandler());
        execute(executors);
    }

    /**
     * SynchronousQueue
     */
    private static void syncQueue() {
        System.out.println("\n\n =======SynchronousQueue====== \n\n");
        Executor executors = new ThreadPoolExecutor(
                2, 3, 30, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
                new RejectHandler());
        execute(executors);
    }


    private static void execute(Executor executors) {
        executors.execute(new NameRunnable(1));
        executors.execute(new NameRunnable(2));
        executors.execute(new NameRunnable(3));
        executors.execute(new NameRunnable(4));
        executors.execute(new NameRunnable(5));
        executors.execute(new NameRunnable(6));
    }

    /***
     * 创建一个有名字的runnable对象
     */
    private static class NameRunnable implements Runnable {
        private int name;

        public NameRunnable(int name) {
            this.name = name;
        }

        public int getName() {
            return name;
        }

        @Override
        public void run() {
            System.out.println(name + " is running... ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " is end !!! ");
        }
    }

    /***
     * 拒绝的Runnable
     */
    private static class RejectHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            NameRunnable name = (NameRunnable) r;

            System.out.print(name.getName() + " is rejected ^^\n");
        }
    }
}
