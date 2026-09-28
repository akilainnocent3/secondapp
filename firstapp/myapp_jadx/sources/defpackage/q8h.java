package defpackage;

import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q8h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q8h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zp70 zp70Var = (zp70) obj2;
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                List listK = b.k(new j58(j58.b), new j58(j58.l));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - zp70Var.h();
                u5a0 u5a0Var = (u5a0) zp70Var.a;
                float fD = fIntBitsToFloat + u5a0Var.D();
                float fMin = Math.min(lzaVar.C1(28.0f), zp70Var.h() - u5a0Var.D());
                if (fMin != 0.0f) {
                    float f = fD - fMin;
                    if ((8 & 2) != 0) {
                        f = 0.0f;
                    }
                    if ((8 & 4) != 0) {
                        fD = Float.POSITIVE_INFINITY;
                    }
                    tcf.V1(lzaVar, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fD))), (8 & 8) != 0 ? 0 : 2), 0L, 0L, 0.0f, null, null, 6, 62);
                }
                break;
            default:
                o540 o540Var = (o540) obj2;
                String str = (String) obj;
                str.getClass();
                if (o540Var.q0().C1()) {
                    FragmentManager parentFragmentManager = o540Var.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    ibs viewLifecycleOwner = o540Var.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    parentFragmentManager.n0("REQUEST_KEY_SHOW_DELETE_HISTORY_TUTORIAL_DIALOG", viewLifecycleOwner, new uld(parentFragmentManager));
                    if (parentFragmentManager.H("DeleteHistoryTutorialDialog") == null) {
                        new vld().show(parentFragmentManager, "DeleteHistoryTutorialDialog");
                    } else {
                        parentFragmentManager.g("REQUEST_KEY_SHOW_DELETE_HISTORY_TUTORIAL_DIALOG");
                    }
                }
                d740 d740VarQ0 = o540Var.q0();
                ej5.c(o8i0.d(d740VarQ0), null, null, new q740(d740VarQ0, str, null), 3);
                break;
        }
        return Unit.a;
    }
}
