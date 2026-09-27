package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2194Ok implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C2194Ok A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C2194Ok> A04;

    public C2194Ok(int i10, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i10;
        this.A03 = str;
        this.A02 = str2;
    }

    public C2194Ok(String str) {
        this(0, null, str);
    }

    private void A00(C2194Ok c2194Ok) {
        this.A00 = c2194Ok;
    }

    public final int A01() {
        return this.A01;
    }

    public final C2194Ok A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C2194Ok> A05() {
        return this.A04;
    }

    public final void A06(C2194Ok c2194Ok) {
        c2194Ok.A00(this);
        this.A04.add(c2194Ok);
    }
}
