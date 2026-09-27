package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18719g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18720h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18721i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18722j = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f18723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18724c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18725d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18726e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18727f = null;

    public f(@NonNull v vVar) {
        this.f18723b = vVar;
    }

    public void a() {
        int i10 = this.f18724c;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f18723b.onInserted(this.f18725d, this.f18726e);
        } else if (i10 == 2) {
            this.f18723b.onRemoved(this.f18725d, this.f18726e);
        } else if (i10 == 3) {
            this.f18723b.onChanged(this.f18725d, this.f18726e, this.f18727f);
        }
        this.f18727f = null;
        this.f18724c = 0;
    }

    @Override // androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i10, int i11, Object obj) {
        int i12;
        if (this.f18724c == 3) {
            int i13 = this.f18725d;
            int i14 = this.f18726e;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f18727f == obj) {
                this.f18725d = Math.min(i10, i13);
                this.f18726e = Math.max(i14 + i13, i12) - this.f18725d;
                return;
            }
        }
        a();
        this.f18725d = i10;
        this.f18726e = i11;
        this.f18727f = obj;
        this.f18724c = 3;
    }

    @Override // androidx.recyclerview.widget.v
    public void onInserted(int i10, int i11) {
        int i12;
        if (this.f18724c == 1 && i10 >= (i12 = this.f18725d)) {
            int i13 = this.f18726e;
            if (i10 <= i12 + i13) {
                this.f18726e = i13 + i11;
                this.f18725d = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f18725d = i10;
        this.f18726e = i11;
        this.f18724c = 1;
    }

    @Override // androidx.recyclerview.widget.v
    public void onMoved(int i10, int i11) {
        a();
        this.f18723b.onMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void onRemoved(int i10, int i11) {
        int i12;
        if (this.f18724c == 2 && (i12 = this.f18725d) >= i10 && i12 <= i10 + i11) {
            this.f18726e += i11;
            this.f18725d = i10;
        } else {
            a();
            this.f18725d = i10;
            this.f18726e = i11;
            this.f18724c = 2;
        }
    }
}
