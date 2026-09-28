package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.chat.data.MsgType;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tih extends RecyclerView.s {
    public final LinearLayoutManager a;
    public final int b = 3;
    public boolean c;

    public tih(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.a;
        int iK = linearLayoutManager.K();
        int iA = linearLayoutManager.a();
        int iF1 = linearLayoutManager.f1();
        td7 td7Var = td7.this;
        Boolean boolD = td7Var.m0().z.d();
        if (!(boolD != null ? boolD.booleanValue() : false)) {
            Boolean boolD2 = td7Var.m0().B.d();
            if (!(boolD2 != null ? boolD2.booleanValue() : false) && iA > iK && iF1 < this.b && td7Var.isVisible()) {
                Boolean boolD3 = td7Var.m0().z.d();
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.g(boolD3, bool)) {
                    itf0.a aVar = itf0.a;
                    aVar.q("SPORTY_CHAT");
                    aVar.a(hce0.a(td7Var.m0().Y, "getOldChatList(), currentFirstMessageNo: "), new Object[0]);
                    be7 be7VarM0 = td7Var.m0();
                    if (be7VarM0.W.length() != 0 && be7VarM0.Y > 1) {
                        be7VarM0.z.m(bool);
                        int i3 = be7VarM0.Y - 1;
                        int iMin = Math.min(i3, 40);
                        LinkedHashMap linkedHashMapG = kpu.g(new Pair("messageNo", String.valueOf(i3)), new Pair("length", String.valueOf(iMin)));
                        ema emaVar = be7VarM0.Q;
                        jc7 jc7Var = be7VarM0.d;
                        if (jc7Var == null) {
                            Intrinsics.n("chatRepo");
                            throw null;
                        }
                        ct90 ct90VarE = jc7Var.e(i3, iMin, MsgType.TEXT.getType(), be7VarM0.W);
                        qm70 qm70Var = wm70.c;
                        ct90 ct90VarB = ct90VarE.d(qm70Var).b(qm70Var);
                        fe7 fe7Var = new fe7(be7VarM0, linkedHashMapG);
                        ct90VarB.a(fe7Var);
                        emaVar.b(fe7Var);
                    }
                }
            }
        }
        if (iF1 == -1 || iF1 + iK >= iA) {
            if (this.c) {
                return;
            }
            this.c = true;
            c(true);
            return;
        }
        if (this.c) {
            this.c = false;
            c(false);
        }
    }

    public abstract void c(boolean z);
}
