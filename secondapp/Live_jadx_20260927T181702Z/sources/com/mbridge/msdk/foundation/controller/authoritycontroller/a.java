package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f66688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f66689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f66690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f66691d;

    public void a(int i10) {
        this.f66688a = i10;
        this.f66689b = i10;
        this.f66690c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f66689b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f66688a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f66691d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f66690c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f66689b;
    }

    public int getAuthGenDataStatus() {
        return this.f66688a;
    }

    public int getAuthSerialIdStatus() {
        return this.f66690c;
    }

    public int getOtherDataStatus() {
        return this.f66691d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f66690c;
                case "authority_device_id":
                    return this.f66689b;
                case "authority_general_data":
                    return this.f66688a;
                case "authority_other":
                    return this.f66691d;
            }
        }
        return 1;
    }
}
