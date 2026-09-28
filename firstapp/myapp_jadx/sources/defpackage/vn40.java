package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.views.fragments.RedBlackFragment$progressBarVisibility$1$1", f = "RedBlackFragment.kt", l = {2804, 2808}, m = "invokeSuspend", v = 1)
public final class vn40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public nn40 a;
    public xo40 b;
    public xo40 c;
    public xo40 d;
    public int e;
    public int f;
    public int i;
    public final /* synthetic */ nn40 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn40(nn40 nn40Var, v1b<? super vn40> v1bVar) {
        super(2, v1bVar);
        this.v = nn40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vn40(this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vn40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r7.M0(r9, r5, r8) == r0) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.i
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            nn40 r8 = r8.a
            android.content.Context r8 = (android.content.Context) r8
            defpackage.uj50.b(r9)
            goto L99
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L1c:
            int r1 = r8.f
            int r3 = r8.e
            xo40 r5 = r8.d
            xo40 r6 = r8.c
            xo40 r7 = r8.b
            android.content.Context r7 = (android.content.Context) r7
            nn40 r7 = r8.a
            defpackage.uj50.b(r9)
            goto L78
        L2e:
            defpackage.uj50.b(r9)
            nn40 r7 = r8.v
            VM extends j8i0 r9 = r7.a
            loj r9 = (defpackage.loj) r9
            if (r9 == 0) goto L46
            et7 r1 = defpackage.o8i0.d(r9)
            hoj r5 = new hoj
            r5.<init>(r9, r4)
            r9 = 3
            defpackage.ej5.c(r1, r4, r4, r5, r9)
        L46:
            android.content.Context r9 = r7.getContext()
            if (r9 == 0) goto L99
            B extends g6i0 r9 = r7.b
            r5 = r9
            xo40 r5 = (defpackage.xo40) r5
            if (r5 == 0) goto L99
            androidx.appcompat.widget.AppCompatImageView r9 = r5.H
            r1 = 2132020829(0x7f140e5d, float:1.9680032E38)
            java.lang.String r1 = r7.getString(r1)
            r1.getClass()
            r8.a = r7
            r8.b = r4
            r8.c = r5
            r8.d = r5
            r6 = 0
            r8.e = r6
            r8.f = r6
            r8.i = r3
            java.lang.Object r9 = r7.M0(r9, r1, r8)
            if (r9 != r0) goto L75
            goto L98
        L75:
            r1 = r6
            r3 = r1
            r6 = r5
        L78:
            androidx.appcompat.widget.AppCompatImageView r9 = r5.I
            r5 = 2132020768(0x7f140e20, float:1.9679908E38)
            java.lang.String r5 = r7.getString(r5)
            r5.getClass()
            r8.a = r4
            r8.b = r6
            r8.c = r4
            r8.d = r4
            r8.e = r3
            r8.f = r1
            r8.i = r2
            java.lang.Object r8 = r7.M0(r9, r5, r8)
            if (r8 != r0) goto L99
        L98:
            return r0
        L99:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
