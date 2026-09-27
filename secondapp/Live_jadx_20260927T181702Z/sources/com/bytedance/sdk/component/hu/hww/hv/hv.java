package com.bytedance.sdk.component.hu.hww.hv;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hv implements Comparable<hv>, Runnable {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f34512sd;
    private int hww = 5;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34513tq = UUID.randomUUID().toString() + TokenBuilder.TOKEN_DELIMITER + String.valueOf(System.nanoTime());

    public hv(String str) {
        this.f34512sd = str;
    }

    public void hww(int i10) {
        this.hww = i10;
    }

    public int hww() {
        return this.hww;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(hv hvVar) {
        if (hww() < hvVar.hww()) {
            return 1;
        }
        return hww() >= hvVar.hww() ? -1 : 0;
    }
}
