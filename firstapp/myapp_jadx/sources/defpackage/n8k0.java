package defpackage;

import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.parser.XmlParserUtil", f = "XmlParserUtil.kt", l = {32}, m = "parseXML", v = 1)
public final class n8k0 extends x1b {
    public Function2 a;
    public XmlPullParser b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o8k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8k0(o8k0 o8k0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = o8k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
