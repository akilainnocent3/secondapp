package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vx80 {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public vx80(PointF pointF, boolean z, List<h4c> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        return ruw.a(sb, this.c, '}');
    }

    public vx80() {
        this.a = new ArrayList();
    }
}
