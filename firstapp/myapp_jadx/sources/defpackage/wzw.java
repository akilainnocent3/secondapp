package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportytv.data.MyProgram;
import com.sporty.android.sportytv.data.Program;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wzw implements Function1 {
    public final /* synthetic */ c0x a;
    public final /* synthetic */ String b;

    public /* synthetic */ wzw(c0x c0xVar, String str) {
        this.a = c0xVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c0x c0xVar = this.a;
        ssw<vzw> sswVar = c0xVar.w;
        ssw<Boolean> sswVar2 = c0xVar.i;
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        if (lk50Var instanceof lk50.c) {
            BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
            sswVar2.m(Boolean.FALSE);
            if (baseResponse.bizCode == 10000) {
                List<Program> programList = ((MyProgram) baseResponse.data).getProgramList();
                if (programList == null || !(!programList.isEmpty())) {
                    sswVar.m(vzw.b.a);
                } else {
                    sswVar.m(new vzw.a(baseResponse));
                }
            } else {
                sswVar.m(vzw.c.a);
            }
        } else if (lk50Var instanceof lk50.a) {
            sswVar2.m(Boolean.FALSE);
            sswVar.m(vzw.c.a);
        } else {
            if (!(lk50Var instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            sswVar2.m(Boolean.valueOf(this.b.length() == 0));
        }
        return Unit.a;
    }
}
