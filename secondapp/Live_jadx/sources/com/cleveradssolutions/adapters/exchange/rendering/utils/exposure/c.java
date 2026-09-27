package com.cleveradssolutions.adapters.exchange.rendering.utils.exposure;

import android.graphics.Rect;
import com.ironsource.C4235d4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f42520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f42521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f42522c;

    public c() {
        this.f42520a = 0.0f;
        this.f42521b = new Rect();
        this.f42522c = null;
    }

    public float a() {
        return this.f42520a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (Float.compare(cVar.f42520a, this.f42520a) != 0) {
                return false;
            }
            Rect rect = this.f42521b;
            if (rect == null ? cVar.f42521b != null : !rect.equals(cVar.f42521b)) {
                return false;
            }
            List list = this.f42522c;
            List list2 = cVar.f42522c;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        float f10 = this.f42520a;
        int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        Rect rect = this.f42521b;
        int iHashCode = (iFloatToIntBits + (rect != null ? rect.hashCode() : 0)) * 31;
        List list = this.f42522c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("\"exposedPercentage\":");
        sb2.append(this.f42520a * 100.0f);
        sb2.append(",");
        sb2.append("\"visibleRectangle\":{");
        sb2.append("\"x\":");
        sb2.append(this.f42521b.left);
        sb2.append(",");
        sb2.append("\"y\":");
        sb2.append(this.f42521b.top);
        sb2.append(",");
        sb2.append("\"width\":");
        sb2.append(this.f42521b.width());
        sb2.append(",");
        sb2.append("\"height\":");
        sb2.append(this.f42521b.height());
        sb2.append("}");
        List list = this.f42522c;
        if (list != null && !list.isEmpty()) {
            sb2.append(", \"occlusionRectangles\":[");
            for (int i10 = 0; i10 < this.f42522c.size(); i10++) {
                Rect rect = (Rect) this.f42522c.get(i10);
                sb2.append("{");
                sb2.append("\"x\":");
                sb2.append(rect.left);
                sb2.append(",");
                sb2.append("\"y\":");
                sb2.append(rect.top);
                sb2.append(",");
                sb2.append("\"width\":");
                sb2.append(rect.width());
                sb2.append(",");
                sb2.append("\"height\":");
                sb2.append(rect.height());
                sb2.append("}");
                if (i10 < this.f42522c.size() - 1) {
                    sb2.append(",");
                }
            }
            sb2.append(C4235d4.j.f61462e);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public c(float f10, Rect rect, List list) {
        this.f42520a = f10;
        this.f42521b = rect;
        this.f42522c = list;
    }
}
