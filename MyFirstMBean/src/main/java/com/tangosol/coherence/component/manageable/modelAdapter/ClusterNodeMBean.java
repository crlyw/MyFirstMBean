package com.tangosol.coherence.component.manageable.modelAdapter;

public class ClusterNodeMBean {

	private String MemberName;
    private String MachineName;
	private Integer UnicastPort;
	private Integer MemoryMaxMB;
	private Integer loggingLevel;
	
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getMachineName() {
		return MachineName;
	}
	public void setMachineName(String machineName) {
		MachineName = machineName;
	}
	public Integer getUnicastPort() {
		return UnicastPort;
	}
	public void setUnicastPort(Integer unicastPort) {
		UnicastPort = unicastPort;
	}
	public Integer getMemoryMaxMB() {
		return MemoryMaxMB;
	}
	public void setMemoryMaxMB(Integer memoryMaxMB) {
		MemoryMaxMB = memoryMaxMB;
	}
	public Integer getLoggingLevel() {
		return loggingLevel;
	}
	public void setLoggingLevel(Integer loggingLevel) {
		this.loggingLevel = loggingLevel;
	}
	
	public void shutdown(){
		
	}
	
	public void resetStatistics(){
		
	}
	
	public void ensureService(String sCacheName){
		
	}
}
