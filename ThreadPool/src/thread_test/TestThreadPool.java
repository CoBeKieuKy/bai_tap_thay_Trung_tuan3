package thread_test;

public class TestThreadPool {
	public static void main(String[] args) throws InterruptedException {
		
		ThreadPool threadPool = new ThreadPool(3, 2, 4);
		for (int taskNumber = 1; taskNumber <= 10; taskNumber++) {
			TestTask task = new TestTask(taskNumber);
			threadPool.submitTask(task);
		}	
		while(ThreadPool.queue.getSize()!=0) {
//			if(ThreadPool.queue.getSize()==0) {
//				ThreadPool.shutdown();
//				break;
//			}
		}
		if(ThreadPool.queue.getSize()==0) {
			ThreadPool.shutdown();
		}
	}
}
	

