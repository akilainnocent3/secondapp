package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f147926a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f147927b;

    public final cw0 a(int i10) {
        if (this.f147927b) {
            throw new IllegalStateException();
        }
        this.f147926a.append(i10, true);
        return this;
    }

    public final dw0 a() {
        if (!this.f147927b) {
            this.f147927b = true;
            return new dw0(this.f147926a);
        }
        throw new IllegalStateException();
    }
}
