import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by skyworth on 2016/4/29.
 */
public class HttpClient20TestStub {
	private String url = "/aiui/http/stub";
	private String host = "192.168.1.116";

	public void postStub() {
		try {
			String param = "city=" + URLEncoder.encode("南京", "utf-8");
			HttpClient httpClient = new HttpClient();
			httpClient.getHostConfiguration().setHost(host, 8080, "http");
			//HttpMethod method = getMethod(url, param);
			HttpMethod method = postMethod(url);
			httpClient.executeMethod(method);
			String response = method.getResponseBodyAsString();
			System.out.println(response);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private HttpMethod getMethod(String url, String param) {
		GetMethod get = new GetMethod(url + "?" + param);
		get.releaseConnection();
		return get;
	}

	private HttpMethod postMethod(String url) {
		PostMethod post = new PostMethod(url);
		post.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");
		NameValuePair[] param = {new NameValuePair("city", "南京"),
				new NameValuePair("userId", "agile"),
				new NameValuePair("module", "aiui")};
		post.setRequestBody(param);
		post.releaseConnection();
		return post;
	}

	public static void stub_main() {
		HttpClient20TestStub httpClient20TestStub = new HttpClient20TestStub();
		httpClient20TestStub.postStub();

	}
}
