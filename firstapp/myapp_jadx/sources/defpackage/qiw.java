package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$changeLeagueOrMatchSelections$1", f = "MultiMakerViewModel.kt", l = {558, 559}, m = "invokeSuspend", v = 2)
public final class qiw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tjw b;
    public final /* synthetic */ List<ehw> c;
    public final /* synthetic */ thw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiw(tjw tjwVar, List<ehw> list, thw thwVar, v1b<? super qiw> v1bVar) {
        super(2, v1bVar);
        this.b = tjwVar;
        this.c = list;
        this.d = thwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qiw(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qiw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (r13.join(r12) == r0) goto L41;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qiw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
