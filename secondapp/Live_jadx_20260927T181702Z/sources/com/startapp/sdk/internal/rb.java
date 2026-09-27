package com.startapp.sdk.internal;

import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9 f75458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f75459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f75460c = "";

    public rb(a9 a9Var) {
        this.f75458a = a9Var;
    }

    public final void a(List3DActivity list3DActivity) {
        a9 a9Var = this.f75458a;
        a9Var.f74534f = list3DActivity;
        a9Var.f74533e.clear();
        a9Var.f74535g = 0;
        a9Var.f74536h.clear();
        HashMap map = a9Var.f74531c;
        if (map != null) {
            for (xf xfVar : map.values()) {
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
            a9Var.f74531c.clear();
        }
    }
}
