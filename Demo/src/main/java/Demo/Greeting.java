package Demo;

public class Greeting {

    private  long id;
    private  String content;
	
    public Greeting(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.content = format;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

    
}
