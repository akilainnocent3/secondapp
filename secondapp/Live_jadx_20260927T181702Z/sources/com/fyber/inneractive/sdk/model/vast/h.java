package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f45197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f45200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45203g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.vast.b f45205i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f45204h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f45206j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f45202f) && TextUtils.isEmpty(this.f45201e) && this.f45200d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f45197a);
        sb2.append(" h:");
        sb2.append(this.f45198b);
        sb2.append(" ctr:");
        sb2.append(this.f45203g);
        sb2.append(" clt:");
        sb2.append(this.f45204h);
        if (!TextUtils.isEmpty(this.f45202f)) {
            sb2.append(" html:");
            sb2.append(this.f45202f);
        }
        if (this.f45200d != null) {
            sb2.append(" static:");
            sb2.append(this.f45200d.f45209b);
            sb2.append("creative:");
            sb2.append(this.f45200d.f45208a);
        }
        if (!TextUtils.isEmpty(this.f45201e)) {
            sb2.append(" iframe:");
            sb2.append(this.f45201e);
        }
        sb2.append(" events:");
        sb2.append(this.f45206j);
        if (this.f45205i != null) {
            sb2.append(" reason:");
            sb2.append(this.f45205i.f44992a);
            sb2.append(" exception:");
            sb2.append(this.f45205i.getMessage());
        }
        return sb2.toString();
    }
}
