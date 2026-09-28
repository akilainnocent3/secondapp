package defpackage;

import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase", f = "CMSUpdateUseCase.kt", l = {151}, m = "parseXML", v = 2)
public final class wp5 extends x1b {
    public long a;
    public Function2 b;
    public XmlPullParser c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xp5 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp5(xp5 xp5Var, x1b x1bVar) {
        super(x1bVar);
        this.f = xp5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.d(0L, null, null, this);
    }
}
