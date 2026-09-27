package com.bytedance.adsdk.tq.hww.hww;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public class ny implements ed, nod {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final com.bytedance.adsdk.tq.sd.tq.rs f32020hu;
    private final String vy;
    private final Path hww = new Path();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Path f32023tq = new Path();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Path f32022sd = new Path();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final List<ed> f32021hv = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.tq.hww.hww.ny$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hww;

        static {
            int[] iArr = new int[com.bytedance.adsdk.tq.sd.tq.rs.hww.values().length];
            hww = iArr;
            try {
                iArr[com.bytedance.adsdk.tq.sd.tq.rs.hww.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hww[com.bytedance.adsdk.tq.sd.tq.rs.hww.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hww[com.bytedance.adsdk.tq.sd.tq.rs.hww.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hww[com.bytedance.adsdk.tq.sd.tq.rs.hww.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hww[com.bytedance.adsdk.tq.sd.tq.rs.hww.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ny(com.bytedance.adsdk.tq.sd.tq.rs rsVar) {
        this.vy = rsVar.hww();
        this.f32020hu = rsVar;
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.nod
    public void hww(ListIterator<sd> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            sd sdVarPrevious = listIterator.previous();
            if (sdVarPrevious instanceof ed) {
                this.f32021hv.add((ed) sdVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.ed
    public Path vy() {
        this.f32022sd.reset();
        if (this.f32020hu.sd()) {
            return this.f32022sd;
        }
        int i10 = AnonymousClass1.hww[this.f32020hu.tq().ordinal()];
        if (i10 == 1) {
            hww();
        } else if (i10 == 2) {
            hww(Path.Op.UNION);
        } else if (i10 == 3) {
            hww(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            hww(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            hww(Path.Op.XOR);
        }
        return this.f32022sd;
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.sd
    public void hww(List<sd> list, List<sd> list2) {
        for (int i10 = 0; i10 < this.f32021hv.size(); i10++) {
            this.f32021hv.get(i10).hww(list, list2);
        }
    }

    private void hww() {
        for (int i10 = 0; i10 < this.f32021hv.size(); i10++) {
            this.f32022sd.addPath(this.f32021hv.get(i10).vy());
        }
    }

    @TargetApi(19)
    private void hww(Path.Op op2) {
        this.f32023tq.reset();
        this.hww.reset();
        for (int size = this.f32021hv.size() - 1; size > 0; size--) {
            ed edVar = this.f32021hv.get(size);
            if (edVar instanceof vy) {
                vy vyVar = (vy) edVar;
                List<ed> listTq = vyVar.tq();
                for (int size2 = listTq.size() - 1; size2 >= 0; size2--) {
                    Path pathVy = listTq.get(size2).vy();
                    pathVy.transform(vyVar.sd());
                    this.f32023tq.addPath(pathVy);
                }
            } else {
                this.f32023tq.addPath(edVar.vy());
            }
        }
        ed edVar2 = this.f32021hv.get(0);
        if (edVar2 instanceof vy) {
            vy vyVar2 = (vy) edVar2;
            List<ed> listTq2 = vyVar2.tq();
            for (int i10 = 0; i10 < listTq2.size(); i10++) {
                Path pathVy2 = listTq2.get(i10).vy();
                pathVy2.transform(vyVar2.sd());
                this.hww.addPath(pathVy2);
            }
        } else {
            this.hww.set(edVar2.vy());
        }
        this.f32022sd.op(this.hww, this.f32023tq, op2);
    }
}
