package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f74692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f74693b = UUID.randomUUID();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobRequest$Network f74694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f74696e;

    public de(ce ceVar) {
        this.f74692a = ceVar.f74647a;
        this.f74694c = ceVar.f74648b;
        this.f74695d = ceVar.f74649c;
        this.f74696e = ceVar.f74650d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            strArr[i10] = clsArr[i10].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
