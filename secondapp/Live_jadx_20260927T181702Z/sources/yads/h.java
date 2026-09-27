package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149841b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f149842c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i10 = this.f149841b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = hg0.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA != 2) {
            this.f149841b = 4;
            u23 u23Var = (u23) this;
            int i11 = u23Var.f156230g;
            while (true) {
                int i12 = u23Var.f156230g;
                if (i12 == -1) {
                    u23Var.f149841b = 3;
                    string = null;
                    break;
                }
                int iA2 = u23Var.f156232i.f156722a.a(u23Var.f156227d, i12);
                if (iA2 == -1) {
                    iA2 = u23Var.f156227d.length();
                    u23Var.f156230g = -1;
                } else {
                    u23Var.f156230g = iA2 + 1;
                }
                int i13 = u23Var.f156230g;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    u23Var.f156230g = i14;
                    if (i14 > u23Var.f156227d.length()) {
                        u23Var.f156230g = -1;
                    }
                } else {
                    while (i11 < iA2 && u23Var.f156228e.a(u23Var.f156227d.charAt(i11))) {
                        i11++;
                    }
                    while (iA2 > i11 && u23Var.f156228e.a(u23Var.f156227d.charAt(iA2 - 1))) {
                        iA2--;
                    }
                    if (!u23Var.f156229f || i11 != iA2) {
                        int i15 = u23Var.f156231h;
                        if (i15 == 1) {
                            iA2 = u23Var.f156227d.length();
                            u23Var.f156230g = -1;
                            while (iA2 > i11 && u23Var.f156228e.a(u23Var.f156227d.charAt(iA2 - 1))) {
                                iA2--;
                            }
                        } else {
                            u23Var.f156231h = i15 - 1;
                        }
                        string = u23Var.f156227d.subSequence(i11, iA2).toString();
                        break;
                    }
                    i11 = u23Var.f156230g;
                }
            }
            this.f149842c = string;
            if (this.f149841b != 3) {
                this.f149841b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f149841b = 2;
        String str = this.f149842c;
        this.f149842c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
