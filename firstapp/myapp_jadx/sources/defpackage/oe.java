package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oe extends qlr implements Function1<use, tse> {
    public final /* synthetic */ fe<Object> a;
    public final /* synthetic */ ie b;
    public final /* synthetic */ String c;
    public final /* synthetic */ vd<Object, Object> d;
    public final /* synthetic */ ytw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(fe feVar, ie ieVar, String str, vd vdVar, ytw ytwVar) {
        super(1);
        this.a = feVar;
        this.b = ieVar;
        this.c = str;
        this.d = vdVar;
        this.e = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        final ytw ytwVar = this.e;
        le leVarD = this.b.d(this.c, this.d, new ud() { // from class: me
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((Function1) ytwVar.getValue()).invoke(obj);
            }
        });
        fe<Object> feVar = this.a;
        feVar.a = leVarD;
        return new ne(feVar);
    }
}
