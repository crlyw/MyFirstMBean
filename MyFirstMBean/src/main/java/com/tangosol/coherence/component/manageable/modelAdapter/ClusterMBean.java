package com.tangosol.coherence.component.manageable.modelAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClusterMBean {

	private String ClusterName;
	private Integer ClusterSize;
	private String LicenseMode;
	private Integer LocalMemberId;
	private int[] MemberIds;
	private String[] Members;
	private String[] MembersDeparted;
	private Long MembersDepartureCount;
	private Integer OldestMemberId;
	private Date RefreshTime;
	private Boolean Running;
	private String Version;
	
	public ClusterMBean() throws ParseException {
		
		ClusterName = "MERCURY-UAT-MOCKLOCALLY";
		ClusterSize = 8;
		LicenseMode = "Development";
		LocalMemberId = 8;
		MemberIds = new int[]{1,2,3,4,5,6,7,8};
		Members = new String[]{
				"Member(Id=1, Timestamp=2015-10-15 02:57:22.632, Address=198.18.160.232:12088, MachineId=29915, Location=site:,machine:wupra08a0135,process:38183,member:MER-Partitioned-node1-MOCK, Role=CoherenceServer)",
				"Member(Id=2, Timestamp=2015-10-15 02:57:52.883, Address=198.18.160.235:12090, MachineId=50115, Location=site:,machine:wupra11a0135,process:11441,member:MER-Extend-node8-MOCK, Role=CoherenceServer)",
				"Member(Id=3, Timestamp=2015-10-15 02:57:52.892, Address=198.18.160.233:12090, MachineId=19834, Location=site:,machine:wupra09a0135,process:28551,member:MER-Extend-node6-MOCK, Role=CoherenceServer)",
				"Member(Id=4, Timestamp=2015-10-15 02:57:52.931, Address=198.18.160.234:12088, MachineId=60196, Location=site:,machine:wupra10a0135,process:8960,member:MER-Partitioned-node3-MOCK, Role=CoherenceServer)",
				"Member(Id=5, Timestamp=2015-10-15 02:57:52.961, Address=198.18.160.232:12090, MachineId=29915, Location=site:,machine:wupra08a0135,process:38348,member:MER-Extend-node5-MOCK, Role=CoherenceServer)",
				"Member(Id=6, Timestamp=2015-10-15 02:57:53.028, Address=198.18.160.235:12088, MachineId=50115, Location=site:,machine:wupra11a0135,process:11275,member:MER-Partitioned-node4-MOCK, Role=CoherenceServer)",
				"Member(Id=7, Timestamp=2015-10-15 02:57:52.994, Address=198.18.160.234:12090, MachineId=60196, Location=site:,machine:wupra10a0135,process:9139,member:MER-Extend-node7-MOCK, Role=CoherenceServer)",
				"Member(Id=8, Timestamp=2015-10-15 02:57:53.045, Address=198.18.160.233:12088, MachineId=19834, Location=site:,machine:wupra09a0135,process:28385,member:MER-Partitioned-node2-MOCK, Role=CoherenceServer)"
				};
		MembersDeparted = new String[]{};
		MembersDepartureCount = (long) 0;
		OldestMemberId = 1;
		RefreshTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("02-04-2014 23:37:50");
		Running = true;
		Version = "3.7.1.10";
	}

	public String getClusterName() {
		return ClusterName;
	}

	public void setClusterName(String clusterName) {
		ClusterName = clusterName;
	}

	public Integer getClusterSize() {
		return ClusterSize;
	}

	public void setClusterSize(Integer clusterSize) {
		ClusterSize = clusterSize;
	}

	public String getLicenseMode() {
		return LicenseMode;
	}

	public void setLicenseMode(String licenseMode) {
		LicenseMode = licenseMode;
	}

	public Integer getLocalMemberId() {
		return LocalMemberId;
	}

	public void setLocalMemberId(Integer localMemberId) {
		LocalMemberId = localMemberId;
	}

	public int[] getMemberIds() {
		return MemberIds;
	}

	public void setMemberIds(int[] memberIds) {
		MemberIds = memberIds;
	}

	public String[] getMembers() {
		return Members;
	}

	public void setMembers(String[] members) {
		Members = members;
	}

	public String[] getMembersDeparted() {
		return MembersDeparted;
	}

	public void setMembersDeparted(String[] membersDeparted) {
		MembersDeparted = membersDeparted;
	}

	public Long getMembersDepartureCount() {
		return MembersDepartureCount;
	}

	public void setMembersDepartureCount(Long membersDepartureCount) {
		MembersDepartureCount = membersDepartureCount;
	}

	public Integer getOldestMemberId() {
		return OldestMemberId;
	}

	public void setOldestMemberId(Integer oldestMemberId) {
		OldestMemberId = oldestMemberId;
	}

	public Date getRefreshTime() {
		return RefreshTime;
	}

	public void setRefreshTime(Date refreshTime) {
		RefreshTime = refreshTime;
	}

	public Boolean getRunning() {
		return Running;
	}

	public void setRunning(Boolean running) {
		Running = running;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public void shutdown(){
		
	}
	
	public void ensureRunning(){
		
	}
}
