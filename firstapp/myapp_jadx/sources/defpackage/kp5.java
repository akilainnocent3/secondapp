package defpackage;

import com.sportygames.newcms.CMSRes;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.loader.sound.CMSSoundLoader", f = "CMSSoundLoader.kt", l = {41, 77}, m = "load", v = 1)
public final class kp5 extends x1b {
    public CMSRes.Data a;
    public String b;
    public vpa0 c;
    public File d;
    public String e;
    public String f;
    public String i;
    public /* synthetic */ Object v;
    public final /* synthetic */ lp5 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp5(lp5 lp5Var, x1b x1bVar) {
        super(x1bVar);
        this.w = lp5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
