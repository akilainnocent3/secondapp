package defpackage;

import android.content.Context;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.f;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class yn5 implements bo5<cbn> {
    public final Context a;

    public yn5(Context context) {
        context.getClass();
        this.a = context;
        nn5 nn5Var = nn5.String;
    }

    @Override // defpackage.bo5
    public final Object a(CMSRes.Data data, String str, do5 do5Var, f.a.C0443a c0443a) {
        Context context = this.a;
        nan.a aVar = new nan.a(context);
        aVar.c = str;
        abn.a(aVar, false);
        wr5 wr5Var = wr5.c;
        aVar.l = wr5Var;
        aVar.m = wr5Var;
        Object objB = qw90.a(context).b(aVar.a(), c0443a);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.bo5
    public final do5 b() {
        return new cbn();
    }

    @Override // defpackage.bo5
    public final nn5 getType() {
        return nn5.Image;
    }
}
