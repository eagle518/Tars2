// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class LoadInfo {

	@TarsStructProperty(order = 0, isRequire = true)
	public float avg1 = 0F;
	@TarsStructProperty(order = 1, isRequire = true)
	public float avg5 = 0F;
	@TarsStructProperty(order = 2, isRequire = true)
	public float avg15 = 0F;
	@TarsStructProperty(order = 3, isRequire = false)
	public int avgCpu = 0;

	public float getAvg1() {
		return avg1;
	}

	public void setAvg1(float avg1) {
		this.avg1 = avg1;
	}

	public float getAvg5() {
		return avg5;
	}

	public void setAvg5(float avg5) {
		this.avg5 = avg5;
	}

	public float getAvg15() {
		return avg15;
	}

	public void setAvg15(float avg15) {
		this.avg15 = avg15;
	}

	public int getAvgCpu() {
		return avgCpu;
	}

	public void setAvgCpu(int avgCpu) {
		this.avgCpu = avgCpu;
	}

	public LoadInfo() {
	}

	public LoadInfo(float avg1, float avg5, float avg15, int avgCpu) {
		this.avg1 = avg1;
		this.avg5 = avg5;
		this.avg15 = avg15;
		this.avgCpu = avgCpu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(avg1);
		result = prime * result + TarsUtil.hashCode(avg5);
		result = prime * result + TarsUtil.hashCode(avg15);
		result = prime * result + TarsUtil.hashCode(avgCpu);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof LoadInfo)) {
			return false;
		}
		LoadInfo other = (LoadInfo) obj;
		return (
			TarsUtil.equals(avg1, other.avg1) &&
			TarsUtil.equals(avg5, other.avg5) &&
			TarsUtil.equals(avg15, other.avg15) &&
			TarsUtil.equals(avgCpu, other.avgCpu) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(avg1, 0);
		_os.write(avg5, 1);
		_os.write(avg15, 2);
		_os.write(avgCpu, 3);
	}

	public void readFrom(TarsInputStream _is) {
		this.avg1 = _is.read(avg1, 0, true);
		this.avg5 = _is.read(avg5, 1, true);
		this.avg15 = _is.read(avg15, 2, true);
		this.avgCpu = _is.read(avgCpu, 3, false);
	}

}
