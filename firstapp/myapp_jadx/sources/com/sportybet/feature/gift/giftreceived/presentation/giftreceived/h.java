package com.sportybet.feature.gift.giftreceived.presentation.giftreceived;

import defpackage.bki0;
import defpackage.c04;
import defpackage.c0d;
import defpackage.fbe;
import defpackage.ib5;
import defpackage.l48;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wpk;
import defpackage.y5b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedViewModel$handleBetNowClick$1", f = "GiftReceivedViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.b = iVar;
        this.c = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        f aVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        i iVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            fbe fbeVar = iVar.c;
            this.a = 1;
            obj = fbeVar.a(this.c, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wpk wpkVar = (wpk) obj;
        if (wpkVar instanceof wpk.a) {
            List<c04> list = ((wpk.a) wpkVar).a;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bki0.a(((c04) it.next()).getId(), arrayList);
            }
            aVar = new f.a(arrayList);
        } else if (Intrinsics.g(wpkVar, wpk.c.a)) {
            aVar = f.c.a;
        } else {
            if (!Intrinsics.g(wpkVar, wpk.b.a)) {
                uhc.a();
                return null;
            }
            aVar = f.b.a;
        }
        iVar.f.a(aVar);
        return Unit.a;
    }
}
