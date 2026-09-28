package androidx.recyclerview.widget;

import android.os.Trace;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.vig0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {
    public static final ThreadLocal<q> e = new ThreadLocal<>();
    public static final a f = new a();
    public long b;
    public long c;
    public final ArrayList<RecyclerView> a = new ArrayList<>();
    public final ArrayList<c> d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.a;
                if (z == cVar4.a) {
                    int i = cVar4.b - cVar3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.c - cVar4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    public static class b {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                hb5.a("Layout positions must be non-negative");
                return;
            }
            if (i2 < 0) {
                hb5.a("Pixel distance must be non-negative");
                return;
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.C;
            if (recyclerView.B == null || oVar == null || !oVar.w) {
                return;
            }
            if (z) {
                if (!recyclerView.e.g()) {
                    oVar.x(recyclerView.B.getItemCount(), this);
                }
            } else if (!recyclerView.U()) {
                oVar.w(this.a, this.b, recyclerView.x0, this);
            }
            int i = this.d;
            if (i > oVar.y) {
                oVar.y = i;
                oVar.z = z;
                recyclerView.c.n();
            }
        }
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.d0 c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.f.h();
        for (int i2 = 0; i2 < iH; i2++) {
            RecyclerView.d0 d0VarR = RecyclerView.R(recyclerView.f.g(i2));
            if (d0VarR.mPosition == i && !d0VarR.isInvalid()) {
                return null;
            }
        }
        RecyclerView.u uVar = recyclerView.c;
        if (j == Long.MAX_VALUE) {
            try {
                if (vig0.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.a0(false);
                Trace.endSection();
            }
        }
        recyclerView.Z();
        RecyclerView.d0 d0VarL = uVar.l(i, j);
        if (d0VarL != null) {
            if (!d0VarL.isBound() || d0VarL.isInvalid()) {
                uVar.a(d0VarL, false);
            } else {
                uVar.i(d0VarL.itemView);
            }
        }
        return d0VarL;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.I) {
            if (RecyclerView.S0 && !this.a.contains(recyclerView)) {
                ib5.a("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.w0;
        bVar.a = i;
        bVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.a;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            b bVar = recyclerView3.w0;
            if (windowVisibility == 0) {
                bVar.b(recyclerView3, false);
                i += bVar.d;
            }
        }
        ArrayList<c> arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.w0;
                int iAbs = Math.abs(bVar2.b) + Math.abs(bVar2.a);
                for (?? r11 = z; r11 < bVar2.d * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i4);
                    }
                    int[] iArr = bVar2.c;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    cVar2.a = z;
                    cVar2.b = iAbs;
                    cVar2.c = i5;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i6)).d) != null; i6++) {
            RecyclerView.d0 d0VarC = c(recyclerView, cVar.e, cVar.a ? Long.MAX_VALUE : j);
            if (d0VarC != null && d0VarC.mNestedRecyclerView != null && d0VarC.isBound() && !d0VarC.isInvalid() && (recyclerView2 = d0VarC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.T && recyclerView2.f.h() != 0) {
                    RecyclerView.u uVar = recyclerView2.c;
                    RecyclerView.l lVar = recyclerView2.f0;
                    if (lVar != null) {
                        lVar.j();
                    }
                    RecyclerView.o oVar = recyclerView2.C;
                    if (oVar != null) {
                        oVar.B0(uVar);
                        recyclerView2.C.C0(uVar);
                    }
                    uVar.a.clear();
                    uVar.g();
                }
                b bVar3 = recyclerView2.w0;
                bVar3.b(recyclerView2, true);
                if (bVar3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : QQWMbKFOuTf.aTbo);
                        RecyclerView.z zVar = recyclerView2.x0;
                        RecyclerView.f fVar = recyclerView2.B;
                        zVar.d = 1;
                        zVar.e = fVar.getItemCount();
                        zVar.g = false;
                        zVar.h = false;
                        zVar.i = false;
                        for (int i7 = 0; i7 < bVar3.d * 2; i7 += 2) {
                            c(recyclerView2, bVar3.c[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }
}
