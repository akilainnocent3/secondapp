package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.bio.EditBioViewModel$onSaveClicked$1", f = "EditBioViewModel.kt", l = {56, 58}, m = "invokeSuspend", v = 2)
public final class iof extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jof b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ jof a;
        public final /* synthetic */ String b;

        public a(jof jofVar, String str) {
            this.a = jofVar;
            this.b = str;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Regex regex = jof.i;
            return this.a.c.emit(new eof.a(this.b), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iof(v1b v1bVar, jof jofVar, String str) {
        super(2, v1bVar);
        this.b = jofVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new iof(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iof) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r1.collect(r3, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L14:
            defpackage.uj50.b(r6)
            goto L5e
        L18:
            defpackage.uj50.b(r6)
            jof r6 = r5.b
            v340 r1 = r6.b
            uwd0<T> r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            fof r1 = (defpackage.fof) r1
            int r1 = r1.b
            java.lang.String r4 = r5.c
            java.lang.CharSequence r4 = kotlin.text.StringsKt.t0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = defpackage.wae0.K(r1, r4)
            boolean r1 = defpackage.jof.z1(r1, r4)
            if (r1 != 0) goto L4a
            b390 r6 = r6.c
            eof$b r1 = eof.b.a
            r5.a = r3
            java.lang.Object r5 = r6.emit(r1, r5)
            if (r5 != r0) goto L5e
            goto L5d
        L4a:
            vga0 r1 = r6.f
            lyh r1 = r1.r(r4)
            iof$a r3 = new iof$a
            r3.<init>(r6, r4)
            r5.a = r2
            java.lang.Object r5 = r1.collect(r3, r5)
            if (r5 != r0) goto L5e
        L5d:
            return r0
        L5e:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iof.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
