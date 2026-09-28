package defpackage;

import com.sporty.android.core.model.gift.SelectedGiftData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class up3 implements iu2.a {
    public List<Integer> A;
    public Integer B;
    public SelectedGiftData C;
    public SelectedGiftData D;
    public boolean F;
    public int G;
    public final jrm a;
    public int b;
    public String c;
    public String d;
    public int e;
    public String f;
    public boolean v;
    public List<Integer> y;
    public List<Integer> z;
    public boolean i = true;
    public List<Integer> w = new ArrayList();
    public boolean E = true;
    public String H = "";

    public up3(jrm jrmVar) {
        this.a = jrmVar;
        jrmVar.m1(this);
    }

    @Override // iu2.a
    public final void C() {
        if (this.a.U().isEmpty()) {
            this.E = true;
            this.C = null;
        }
    }

    public final void a() {
        this.c = null;
        this.e = 0;
        this.f = "0";
        this.i = false;
    }

    public final void b(SelectedGiftData selectedGiftData) {
        this.C = selectedGiftData;
        jrm jrmVar = this.a;
        if (jrmVar.P1(this)) {
            return;
        }
        jrmVar.m1(this);
    }
}
