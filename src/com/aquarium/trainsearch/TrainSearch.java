package com.aquarium.trainsearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class TrainSearch {
	public static class TicketPrice {

		private ArrayList<Entry> list = new ArrayList<Entry>();

		public static TicketPrice emptyTicketPrice() {
			return new TicketPrice();
		}

		public void addEntry(Entry entry) {
			list.add(entry);
		}

		public Entry getEntry(int position) {
			return list.get(position);
		}

		public int size() {
			return list.size();
		}

		@Override
		public String toString() {
			return "TicketPrice [list=" + list + "]";
		}

		public static class Entry {
			String number;
			String trainCode;
			String fromLocation;
			String toLocation;
			String fromTime;
			String toTime;
			String duration;
			String firstLocation;
			String lastLocation;
			String trainClass;
			String hardSeat;
			String softSeat;
			String hardBed;
			String softBed;
			String classASeat;
			String classBSeat;
			String advancedSoftBed;

			public Entry(String number, String Code, String fromLocation,
					String toLocation, String fromTime, String toTime,
					String duration, String startLocation, String endLocation,
					String trainClass, String hardSeat, String softSeat,
					String hardBed, String softBed, String classASeat,
					String classBSeat, String advancedSoftBed) {
				super();
				this.number = number;
				this.trainCode = Code;
				this.fromLocation = fromLocation;
				this.toLocation = toLocation;
				this.fromTime = fromTime;
				this.toTime = toTime;
				this.duration = duration;
				this.firstLocation = startLocation;
				this.lastLocation = endLocation;
				this.trainClass = trainClass;
				this.hardSeat = hardSeat;
				this.softSeat = softSeat;
				this.hardBed = hardBed;
				this.softBed = softBed;
				this.classASeat = classASeat;
				this.classBSeat = classBSeat;
				this.advancedSoftBed = advancedSoftBed;
			}

			@Override
			public String toString() {
				return "Entry [number=" + number + ", trainCode=" + trainCode
						+ ", fromLocation=" + fromLocation + ", toLocation="
						+ toLocation + ", fromTime=" + fromTime + ", toTime="
						+ toTime + ", duration=" + duration
						+ ", startLocation=" + firstLocation + ", lastLocation="
						+ lastLocation + ", trainClass=" + trainClass
						+ ", hardSeat=" + hardSeat + ", softSeat=" + softSeat
						+ ", hardBed=" + hardBed + ", softBed=" + softBed
						+ ", classASeat=" + classASeat + ", classBSeat="
						+ classBSeat + ", advancedSoftBed=" + advancedSoftBed
						+ "]";
			}

		}
	}

	public static class TrainDetails {
		public static TrainDetails emptyTicketPriceDetails() {
			return new TrainDetails();
		}

		private ArrayList<Entry> list = new ArrayList<Entry>();

		public int size() {
			return list.size();
		}

		public void addEntry(Entry entry) {
			list.add(entry);
		}

		public Entry getEntry(int position) {
			return list.get(position);
		}

		public static class Entry {

			String number;
			String station;
			String trainCode;
			String arriveTime;
			String leaveTime;
			String duration;
			String hardSeat;
			String softSeat;
			String hardBed;
			String softBed;
			String classASeat;
			String classBSeat;
			String advancedSoftBed;

			public Entry(String number, String station, String trainCode,
					String arriveTime, String leaveTime, String duration,
					String hardSeat, String softSeat, String hardBed,
					String softBed, String classASeat, String classBSeat,
					String advancedSoftBed) {
				super();
				this.number = number;
				this.station = station;
				this.trainCode = trainCode;
				this.arriveTime = arriveTime;
				this.leaveTime = leaveTime;
				this.duration = duration;
				this.hardSeat = hardSeat;
				this.softSeat = softSeat;
				this.hardBed = hardBed;
				this.softBed = softBed;
				this.classASeat = classASeat;
				this.classBSeat = classBSeat;
				this.advancedSoftBed = advancedSoftBed;
			}

			@Override
			public String toString() {
				return "Entry [number=" + number + ", station=" + station
						+ ", trainCode=" + trainCode + ", arriveTime=" + arriveTime
						+ ", leaveTime=" + leaveTime + ", duration=" + duration
						+ ", hardSeat=" + hardSeat + ", hardBed=" + hardBed
						+ ", softSeat=" + softSeat + ", softBed=" + softBed
						+ ", classASeat=" + classASeat + ", classBSeat="
						+ classBSeat + ", advancedSoftBed=" + advancedSoftBed
						+ "]";
			}
		}
	}

	public static class TicketLeft {
		private String lsup;
		private ArrayList<Entry> list = new ArrayList<Entry>();

		public boolean isTicketLeft() {
			return list.size() > 0;
		}

		public static TicketLeft emptyTicketLeftInfo() {
			return new TicketLeft();
		}

		public void addEntry(Entry entry) {
			list.add(entry);
		}

		public Entry getEntry(int position) {
			return list.get(position);
		}

		public int size() {
			return list.size();
		}

		@Override
		public String toString() {
			return "TicketLeftInfo [lsup=" + lsup + ", list=" + list + "]";
		}

		public static class Entry {
			String number;
			String trainCode;
			String fromLocation;
			String toLocation;
			String fromTime;
			String toTime;
			String duration;

			String hardSeat;
			String softSeat;
			String hardBed;
			String softBed;
			String classASeat;
			String classBSeat;
			String advancedSoftBed;
			String noSeat;
			String trainClass;

			public Entry(String number, String trainCode, String fromLocation,
					String toLocation, String fromTime, String toTime,
					String duration, String hardSeat, String softSeat,
					String hardBed, String softBed, String classASeat,
					String classBSeat, String advancedSoftBed, String noSeat,
					String trainClass) {

				super();
				this.number = number;
				this.trainCode = trainCode;
				this.fromLocation = fromLocation;
				this.toLocation = toLocation;
				this.fromTime = fromTime;
				this.toTime = toTime;
				this.duration = duration;
				this.hardSeat = hardSeat;
				this.softSeat = softSeat;
				this.hardBed = hardBed;
				this.softBed = softBed;
				this.classASeat = classASeat;
				this.classBSeat = classBSeat;
				this.advancedSoftBed = advancedSoftBed;
				this.noSeat = noSeat;
				this.trainClass = trainClass;
			}

			@Override
			public String toString() {
				return "Entry [number=" + number + ", trainCode=" + trainCode
						+ ", fromLocation=" + fromLocation + ", toLocation="
						+ toLocation + ", fromTime=" + fromTime + ", toTime="
						+ toTime + ", duration=" + duration + ", hardSeat="
						+ hardSeat + ", softSeat=" + softSeat + ", hardBed="
						+ hardBed + ", softBed=" + softBed + ", classASeat="
						+ classASeat + ", classBSeat=" + classBSeat
						+ ", advancedSoftBed=" + advancedSoftBed + ", noSeat="
						+ noSeat + ", trainClass=" + trainClass + "]";
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime
						* result
						+ ((advancedSoftBed == null) ? 0 : advancedSoftBed
								.hashCode());
				result = prime * result
						+ ((classASeat == null) ? 0 : classASeat.hashCode());
				result = prime * result
						+ ((classBSeat == null) ? 0 : classBSeat.hashCode());
				result = prime * result
						+ ((trainCode == null) ? 0 : trainCode.hashCode());
				result = prime * result
						+ ((duration == null) ? 0 : duration.hashCode());
				result = prime
						* result
						+ ((fromLocation == null) ? 0 : fromLocation.hashCode());
				result = prime * result
						+ ((fromTime == null) ? 0 : fromTime.hashCode());
				result = prime * result
						+ ((hardBed == null) ? 0 : hardBed.hashCode());
				result = prime * result
						+ ((hardSeat == null) ? 0 : hardSeat.hashCode());
				result = prime * result
						+ ((noSeat == null) ? 0 : noSeat.hashCode());
				result = prime * result
						+ ((number == null) ? 0 : number.hashCode());
				result = prime * result
						+ ((softBed == null) ? 0 : softBed.hashCode());
				result = prime * result
						+ ((softSeat == null) ? 0 : softSeat.hashCode());
				result = prime * result
						+ ((toLocation == null) ? 0 : toLocation.hashCode());
				result = prime * result
						+ ((toTime == null) ? 0 : toTime.hashCode());
				result = prime * result
						+ ((trainClass == null) ? 0 : trainClass.hashCode());
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Entry other = (Entry) obj;
				if (advancedSoftBed == null) {
					if (other.advancedSoftBed != null)
						return false;
				} else if (!advancedSoftBed.equals(other.advancedSoftBed))
					return false;
				if (classASeat == null) {
					if (other.classASeat != null)
						return false;
				} else if (!classASeat.equals(other.classASeat))
					return false;
				if (classBSeat == null) {
					if (other.classBSeat != null)
						return false;
				} else if (!classBSeat.equals(other.classBSeat))
					return false;
				if (trainCode == null) {
					if (other.trainCode != null)
						return false;
				} else if (!trainCode.equals(other.trainCode))
					return false;
				if (duration == null) {
					if (other.duration != null)
						return false;
				} else if (!duration.equals(other.duration))
					return false;
				if (fromLocation == null) {
					if (other.fromLocation != null)
						return false;
				} else if (!fromLocation.equals(other.fromLocation))
					return false;
				if (fromTime == null) {
					if (other.fromTime != null)
						return false;
				} else if (!fromTime.equals(other.fromTime))
					return false;
				if (hardBed == null) {
					if (other.hardBed != null)
						return false;
				} else if (!hardBed.equals(other.hardBed))
					return false;
				if (hardSeat == null) {
					if (other.hardSeat != null)
						return false;
				} else if (!hardSeat.equals(other.hardSeat))
					return false;
				if (noSeat == null) {
					if (other.noSeat != null)
						return false;
				} else if (!noSeat.equals(other.noSeat))
					return false;
				if (number == null) {
					if (other.number != null)
						return false;
				} else if (!number.equals(other.number))
					return false;
				if (softBed == null) {
					if (other.softBed != null)
						return false;
				} else if (!softBed.equals(other.softBed))
					return false;
				if (softSeat == null) {
					if (other.softSeat != null)
						return false;
				} else if (!softSeat.equals(other.softSeat))
					return false;
				if (toLocation == null) {
					if (other.toLocation != null)
						return false;
				} else if (!toLocation.equals(other.toLocation))
					return false;
				if (toTime == null) {
					if (other.toTime != null)
						return false;
				} else if (!toTime.equals(other.toTime))
					return false;
				if (trainClass == null) {
					if (other.trainClass != null)
						return false;
				} else if (!trainClass.equals(other.trainClass))
					return false;
				return true;
			}

		}
	}

	public static TrainDetails getTicketPriceDetails(String trainCode,
			int monthOfYear, int dayOfMonth) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(
				"http://dynamic.12306.cn/TrainQuery/iframeTrainPassStationByTrainCode.jsp");

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("nday1", String.format("%02d",
				dayOfMonth)));
		nvps.add(new BasicNameValuePair("nday1_new_value", "true"));
		nvps.add(new BasicNameValuePair("nmonth1", String.format("%02d",
				monthOfYear)));
		nvps.add(new BasicNameValuePair("nmonth1_new_value", "true"));
		nvps.add(new BasicNameValuePair("trainCode", trainCode));
		nvps.add(new BasicNameValuePair("trainCode_new_value", "true"));

		try {
			post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			post
					.setHeader("Referer",
							"http://dynamic.12306.cn/TrainQuery/trainPassStationByTrainCode.jsp");
			post
					.setHeader(
							"User-Agent",
							"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.8) Gecko/20100723 Ubuntu/9.10 (karmic) Firefox/3.6.8 GTB7.1");

			HttpResponse response = httpClient.execute(post);

			// System.out.println("response status: " +
			// response.getStatusLine());
			// System.out.println("response headers:" +
			// Arrays.toString(response.getAllHeaders()));

			HttpEntity entity = response.getEntity();

			if (entity != null) {
				final String responseBody = EntityUtils.toString(entity,
						HTTP.UTF_8);
				System.out.println(responseBody);

				return parseTicketPriceDetails(responseBody);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			httpClient.getConnectionManager().shutdown();
		}

		return TrainDetails.emptyTicketPriceDetails();
	}

	public static TicketPrice getTicketPriceByStation(String fromLocation,
			String toLocation, String trainCode, int monthOfYear, int dayOfMonth) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://dynamic.12306.cn/TrainQuery/iframeTicketPriceByStation.jsp");

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("arriveStation_ticketPrice", toLocation));
		nvps.add(new BasicNameValuePair("arriveStation_ticketPrice_new_value", "true"));
		nvps.add(new BasicNameValuePair("condition", ""));
		nvps.add(new BasicNameValuePair("name_ckball", "value_ckball"));
		nvps.add(new BasicNameValuePair("nday2", String.format("%02d", dayOfMonth)));
		nvps.add(new BasicNameValuePair("nday2_new_value", "true"));
		nvps.add(new BasicNameValuePair("nmonth2", String.format("%02d", monthOfYear)));
		nvps.add(new BasicNameValuePair("nmonth2_new_value", "true"));
		nvps.add(new BasicNameValuePair("rFlag", "1"));
		nvps.add(new BasicNameValuePair("startStation_ticketPrice", fromLocation));
		nvps.add(new BasicNameValuePair("startStation_ticketPrice_new_value",
				"true"));
		nvps.add(new BasicNameValuePair("tFlagDC", "DC"));
		nvps.add(new BasicNameValuePair("tFlagK", "K"));
		nvps.add(new BasicNameValuePair("tFlagLK", "LK"));
		nvps.add(new BasicNameValuePair("tFlagPK", "PK"));
		nvps.add(new BasicNameValuePair("tFlagPKE", "PKE"));
		nvps.add(new BasicNameValuePair("tFlagT", "T"));
		nvps.add(new BasicNameValuePair("tFlagZ", "Z"));
		nvps.add(new BasicNameValuePair("trainCode", trainCode));
		nvps.add(new BasicNameValuePair("trainCode_new_value", "false"));

		try {
			post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			post
					.setHeader("Referer",
							"http://dynamic.12306.cn/TrainQuery/ticketPriceByStation.jsp");
			post
					.setHeader(
							"User-Agent",
							"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.8) Gecko/20100723 Ubuntu/9.10 (karmic) Firefox/3.6.8 GTB7.1");

			HttpResponse response = httpClient.execute(post);

			// System.out.println("response status: " +
			// response.getStatusLine());
			// System.out.println("response headers:" +
			// Arrays.toString(response.getAllHeaders()));

			HttpEntity entity = response.getEntity();

			if (entity != null) {
				final String responseBody = EntityUtils.toString(entity,
						HTTP.UTF_8);
//				System.out.println(responseBody);

				return parseTicketPrice(responseBody);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			httpClient.getConnectionManager().shutdown();
		}

		return TicketPrice.emptyTicketPrice();
	}

//	public static TicketPrice getTicketPrice(String fromLocation,
//			String toLocation, int monthOfYear, int dayOfMonth) {
//		DefaultHttpClient httpClient = new DefaultHttpClient();
//		HttpPost post = new HttpPost(
//				"http://dynamic.12306.cn/TrainQuery/iframeTrainInfoByStation.jsp");
//
//		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
//		nvps.add(new BasicNameValuePair("arriveStation", toLocation));
//		nvps.add(new BasicNameValuePair("arriveStation_new_value", "true"));
//		nvps.add(new BasicNameValuePair("name_ckball", "value_ckball"));
//		nvps.add(new BasicNameValuePair("nday1", String.format("%02d",
//				dayOfMonth)));
//		nvps.add(new BasicNameValuePair("nday1_new_value", "true"));
//		nvps.add(new BasicNameValuePair("nmonth1", String.format("%02d",
//				monthOfYear)));
//		nvps.add(new BasicNameValuePair("nmonth1_new_value", "true"));
//		nvps.add(new BasicNameValuePair("rFlag", "1"));
//		nvps.add(new BasicNameValuePair("startStation", fromLocation));
//		nvps.add(new BasicNameValuePair("startStation_new_value", "true"));
//		nvps.add(new BasicNameValuePair("tFlagDC", "DC"));
//		nvps.add(new BasicNameValuePair("tFlagK", "K"));
//		nvps.add(new BasicNameValuePair("tFlagLK", "LK"));
//		nvps.add(new BasicNameValuePair("tFlagPK", "PK"));
//		nvps.add(new BasicNameValuePair("tFlagPKE", "PKE"));
//		nvps.add(new BasicNameValuePair("tFlagT", "T"));
//		nvps.add(new BasicNameValuePair("tFlagZ", "Z"));
//
//		try {
//			post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
//			post
//					.setHeader("Referer",
//							"http://dynamic.12306.cn/TrainQuery/trainInfoByStation.jsp");
//			post
//					.setHeader(
//							"User-Agent",
//							"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.8) Gecko/20100723 Ubuntu/9.10 (karmic) Firefox/3.6.8 GTB7.1");
//
//			HttpResponse response = httpClient.execute(post);
//
//			// System.out.println("response status: " +
//			// response.getStatusLine());
//			// System.out.println("response headers:" +
//			// Arrays.toString(response.getAllHeaders()));
//
//			HttpEntity entity = response.getEntity();
//
//			if (entity != null) {
//				final String responseBody = EntityUtils.toString(entity,
//						HTTP.UTF_8);
//				System.out.println(responseBody);
//
//				return parseTicketPrice(responseBody);
//			}
//		} catch (ClientProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			httpClient.getConnectionManager().shutdown();
//		}
//
//		return TicketPrice.emptyTicketPrice();
//	}

	public static TicketLeft getTicketLeft(String fromLocation,
			String toLocation, String trainCode, int monthOfYear, int dayOfMonth) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(
				"http://dynamic.12306.cn/TrainQuery/iframeLeftTicketByStation.jsp");

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps
				.add(new BasicNameValuePair("arriveStation_ticketLeft",
						toLocation));
		nvps.add(new BasicNameValuePair("arriveStation_ticketLeft_new_value",
				"true"));
		nvps.add(new BasicNameValuePair("lx", "00"));
		nvps.add(new BasicNameValuePair("name_ckball", "value_ckball"));
		nvps.add(new BasicNameValuePair("nday3", String.format("%02d",
				dayOfMonth)));
		nvps.add(new BasicNameValuePair("nday3_new_value", "false"));
		nvps.add(new BasicNameValuePair("nmonth3", String.format("%02d",
				monthOfYear)));
		nvps.add(new BasicNameValuePair("nmonth3_new_value", "true"));
		nvps.add(new BasicNameValuePair("rFlag", "1"));
		nvps
				.add(new BasicNameValuePair("startStation_ticketLeft",
						fromLocation));
		nvps.add(new BasicNameValuePair("startStation_ticketLeft_new_value",
				"true"));
		nvps.add(new BasicNameValuePair("tFlagDC", "DC"));
		nvps.add(new BasicNameValuePair("tFlagK", "K"));
		nvps.add(new BasicNameValuePair("tFlagLK", "LK"));
		nvps.add(new BasicNameValuePair("tFlagPK", "PK"));
		nvps.add(new BasicNameValuePair("tFlagPKE", "PKE"));
		nvps.add(new BasicNameValuePair("tFlagT", "T"));
		nvps.add(new BasicNameValuePair("tFlagZ", "Z"));
		nvps.add(new BasicNameValuePair("trainCode", trainCode));
		nvps.add(new BasicNameValuePair("trainCode_new_value", "true"));

		try {
			post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			post
					.setHeader("Referer",
							"http://dynamic.12306.cn/TrainQuery/leftTicketByStation.jsp");
			post
					.setHeader(
							"User-Agent",
							"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.8) Gecko/20100723 Ubuntu/9.10 (karmic) Firefox/3.6.8 GTB7.1");

			HttpResponse response = httpClient.execute(post);

			// System.out.println("response status: " +
			// response.getStatusLine());
			// System.out.println("response headers:" +
			// Arrays.toString(response.getAllHeaders()));

			HttpEntity entity = response.getEntity();

			if (entity != null) {
				final String responseBody = EntityUtils.toString(entity,
						HTTP.UTF_8);
				// System.out.println(responseBody);

				return parseTicketLeft(responseBody);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			httpClient.getConnectionManager().shutdown();
		}

		return TicketLeft.emptyTicketLeftInfo();
	}

	private static TrainDetails parseTicketPriceDetails(String responseBody) {
		TrainDetails details = new TrainDetails();

		Pattern pattern = Pattern.compile(
				"parent\\.mygrid\\.addRow\\(\\d+,\"(\\d+,.+)\"",
				Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(responseBody);
		while (matcher.find()) {
			String line = matcher.group(1);

			String[] segments = line.split("\\s*,\\s*");

			String number = segments[0];
			String station = parseLocation(segments[1]);
			String code = segments[2];
			String arriveTime = segments[3];
			String leaveTime = segments[4];
			String duration = segments[5];
			String hardSeat = segments[6];
			String softSeat = segments[7];
			String hardBed = segments[8];
			String softBed = segments[9];
			String classASeat = segments[10];
			String classBSeat = segments[11];
			String advancedSoftBed = segments[12];

			details.addEntry(new TrainDetails.Entry(number, station,
					code, arriveTime, leaveTime, duration, hardSeat, softSeat,
					hardBed, softBed, classASeat, classBSeat, advancedSoftBed));
		}
		return details;
	}

	private static TicketPrice parseTicketPrice(String responseBody) {
		TicketPrice price = new TicketPrice();

		Pattern pattern = Pattern.compile(
				"^parent\\.mygrid\\.addRow\\(\\d+,\"(\\d+,.+)\"",
				Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(responseBody);
		while (matcher.find()) {
			String line = matcher.group(1);

			String[] segments = line.split("\\s*,\\s*");

			String number = segments[0];
			String code = parseLocation(segments[1]);
			String fromLocation = parseLocation(segments[2]);
			String toLocation = parseLocation(segments[3]);
			String fromTime = segments[4];
			String toTime = segments[5];
			String duration = segments[6];
			String hardSeat = segments[7];
			String softSeat = segments[8];
			String hardBed = segments[9];
			String softBed = segments[10];
			String classASeat = segments[11];
			String classBSeat = segments[12];
			String advancedSoftBed = segments[13];
			String startLocation = parseLocation(segments[14]);
			String endLocation = parseLocation(segments[15]);
			String trainClass = segments[16];

			price.addEntry(new TicketPrice.Entry(number, code, fromLocation,
					toLocation, fromTime, toTime, duration, startLocation,
					endLocation, trainClass, hardSeat, softSeat, hardBed,
					softBed, classASeat, classBSeat, advancedSoftBed));
		}
		return price;
	}

	private static TicketLeft parseTicketLeft(String responseBody) {
		TicketLeft left = new TicketLeft();

		left.lsup = parseLsup(responseBody);

		Pattern pattern = Pattern.compile(
				"^parent\\.mygrid\\.addRow\\(\\d+,\"(\\d+,.+)\"",
				Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(responseBody);
		while (matcher.find()) {
			String line = matcher.group(1);

			String[] segments = line.split("\\s*,\\s*");

			String number = segments[0];
			String code = parseLocation(segments[1]);
			String fromLocation = parseLocation(segments[2]);
			String toLocation = parseLocation(segments[3]);
			String fromTime = segments[4];
			String toTime = segments[5];
			String duration = segments[6];
			String hardSeat = segments[7];
			String softSeat = segments[8];
			String hardBed = segments[9];
			String softBed = segments[10];
			String classASeat = segments[11];
			String classBSeat = segments[12];
			String advancedSoftBed = segments[13];
			String noSeat = segments[14];
			String trainClass = segments[15];

			left.addEntry(new TicketLeft.Entry(number, code, fromLocation,
					toLocation, fromTime, toTime, duration, hardSeat, softSeat,
					hardBed, softBed, classASeat, classBSeat, advancedSoftBed,
					noSeat, trainClass));
		}
		return left;
	}

	private static String parseLocation(String codeStr) {
		int indexOfCaret = codeStr.indexOf('^');
		if (indexOfCaret > 0) {
			return codeStr.substring(0, indexOfCaret);
		} else {
			return "";
		}
	}

	private static String parseLsup(String responseBody) {
		String lsup = "";
		Pattern pattern = Pattern
				.compile("parent\\.document\\.getElementById\\(\"gxsj\"\\)\\.innerHTML=\"([^\"]+)\";");
		Matcher matcher = pattern.matcher(responseBody);
		if (matcher.find()) {
			lsup = matcher.group(1);
		}
		return lsup;
	}

	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		// TicketLeft ticketLeft = getTicketLeft("北京", "上海", 10, 5);
		// TicketLeft ticketLeft = getTicketLeft("T61", 10, 5);
		// System.out.println(ticketLeft);
		sampleTicketPriceByStation1();
		sampleTicketPriceByStation2();
		sampleTicketLeft1();
		sampleTicketLeft2();
	}
	
	private static void sampleTicketLeft1() {
		String fromLocation = "北京";
		String toLocation = "上海";
		TicketLeft left = getTicketLeft(fromLocation, toLocation, "", 10, 15);
		System.out.println("sampleTicketLeft1 =============== " + fromLocation + " -> " + toLocation + " ===============");
		for (com.aquarium.trainsearch.TrainSearch.TicketLeft.Entry entry : left.list) {
			printTicketLeftEntry(entry);
		}
	}
	
	private static void sampleTicketLeft2() {
		String trainCode = "T61";
		TicketLeft left = getTicketLeft("", "", trainCode, 10, 15);
		System.out.println("sampleTicketLeft2 =============== " + trainCode + " ===============");
		for (com.aquarium.trainsearch.TrainSearch.TicketLeft.Entry entry : left.list) {
			printTicketLeftEntry(entry);
		}
	}
	
	private static void printTicketLeftEntry(
			com.aquarium.trainsearch.TrainSearch.TicketLeft.Entry entry) {
		System.out.printf("%s\t%-25s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
				entry.number,
				entry.trainCode,
				entry.fromLocation,
				entry.toLocation,
				entry.fromTime,
				entry.toTime,
				entry.duration,
				entry.hardSeat,
				entry.softSeat,
				entry.hardBed,
				entry.softBed,
				entry.classASeat,
				entry.classBSeat,
				entry.advancedSoftBed,
				entry.noSeat,
				entry.trainClass);
	}

	private static void sampleTicketPriceByStation1() {
		String fromLocation = "北京";
		String toLocation = "上海";
		TicketPrice price = getTicketPriceByStation(fromLocation, toLocation, "", 10, 5);
		System.out.println("sampleTicketPriceByStation1 =============== " + fromLocation + " -> " + toLocation + " ===============");
		for (com.aquarium.trainsearch.TrainSearch.TicketPrice.Entry entry : price.list) {
			printTicketPriceEntry(entry);
		}
	}
	
	private static void sampleTicketPriceByStation2() {
		String trainCode = "T61";
		TicketPrice price = getTicketPriceByStation("", "", trainCode, 10, 5);
		System.out.println("sampleTicketPriceByStation2 =============== " + trainCode + " ===============");
		for (com.aquarium.trainsearch.TrainSearch.TicketPrice.Entry entry : price.list) {
			printTicketPriceEntry(entry);
		}
	}

	private static void printTicketPriceEntry(
			com.aquarium.trainsearch.TrainSearch.TicketPrice.Entry entry) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				entry.number,
				entry.trainCode,
				entry.fromLocation,
				entry.toLocation,
				entry.hardSeat,
				entry.softSeat,
				entry.hardBed,
				entry.softBed,
				entry.classASeat,
				entry.classBSeat,
				entry.advancedSoftBed,
				entry.fromTime,
				entry.toTime,
				entry.duration,
				entry.firstLocation,
				entry.lastLocation,
				entry.trainClass);
	}
}
