import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyworth on 2016/5/4.
 */
public class JsonStub {

	//影视名称
	private String videoName;

	//该集影视的具体类（聚合和爱奇艺分别实现）
	private Object videoObj;

	//影视的类型（聚合播放器，爱奇艺播放器）
	private String videoType;

	private List<EpisodeInfo> episodeInfos = new ArrayList<EpisodeInfo>();

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String mVideoName) {
		this.videoName = mVideoName;
	}

	public List<EpisodeInfo> getEpisodeInfos() {
		return episodeInfos;
	}

	public void setEpisodeInfos(List<EpisodeInfo> mEpisodeInfos) {
		this.episodeInfos = mEpisodeInfos;
	}

	public Object getVideoObj() {
		return videoObj;
	}

	public void setVideoObj(Object mVideoObj) {
		this.videoObj = mVideoObj;
	}

	public String getVideoType() {
		return videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

	public static class EpisodeInfo {
		//用来展示的剧集标题
		private String episodeTitle;
		//剧集的具体信息类（聚合和爱奇艺分别实现）
		private Object episodeObj;

		public String getEpisodeTitle() {
			return episodeTitle;
		}

		public void setEpisodeTitle(String episodeTitle) {
			this.episodeTitle = episodeTitle;
		}

		public Object getEpisodeObj() {
			return episodeObj;
		}

		public void setEpisodeObj(Object episodeObj) {
			this.episodeObj = episodeObj;
		}
	}

	public static void stub_main() {
		JsonStub videoItemInfo = new JsonStub();
		videoItemInfo.setVideoType("AIUI_MUSIC");
//		videoItemInfo.setVideoType("AIUI_VIDEO");
		videoItemInfo.setVideoName("播放列表");
		videoItemInfo.setVideoObj("jieshao");

		EpisodeInfo episodeInfo = new EpisodeInfo();
		episodeInfo.setEpisodeTitle("1");
		episodeInfo.setEpisodeObj("1");
		videoItemInfo.getEpisodeInfos().add(episodeInfo);
		episodeInfo = new EpisodeInfo();
		episodeInfo.setEpisodeTitle("2");
		episodeInfo.setEpisodeObj("2");
		videoItemInfo.getEpisodeInfos().add(episodeInfo);
		String str = JSONObject.toJSONString(videoItemInfo);
		System.out.println("str :"+ str);

	}
}


