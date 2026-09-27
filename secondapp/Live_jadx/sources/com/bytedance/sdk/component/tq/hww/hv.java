package com.bytedance.sdk.component.tq.hww;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class hv extends ed {
    List<String> hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    List<String> f35022tq;

    public hv(List<String> list, List<String> list2) {
        this.hww = list;
        this.f35022tq = list2;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class hww {
        private final List<String> hww = new ArrayList();

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final List<String> f35023tq = new ArrayList();

        public hww hww(String str, String str2) {
            this.hww.add(str);
            this.f35023tq.add(str2);
            return this;
        }

        public hv hww() {
            return new hv(this.hww, this.f35023tq);
        }
    }
}
