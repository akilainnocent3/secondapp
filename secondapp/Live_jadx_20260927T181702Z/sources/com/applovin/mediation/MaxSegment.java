package com.applovin.mediation;

import com.applovin.impl.sdk.p;
import fw.b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class MaxSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29888b;

    public MaxSegment(int i10, List<Integer> list) {
        this.f29887a = i10;
        this.f29888b = list;
        a(i10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        p.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i10);
    }

    public int getKey() {
        return this.f29887a;
    }

    public List<Integer> getValues() {
        return this.f29888b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f29887a + ", values=" + this.f29888b + b.f85383j;
    }
}
