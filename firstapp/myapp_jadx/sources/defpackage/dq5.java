package defpackage;

import com.sportygames.newcms.d;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase", f = "CMSUseCase.kt", l = {221}, m = "parseXML", v = 1)
public final class dq5 extends x1b {
    public Function2 a;
    public XmlPullParser b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq5(d dVar, x1b x1bVar) {
        super(x1bVar);
        this.d = dVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
