package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$getCacheData$1", f = "GiftViewModel.kt", l = {500, 501, 516}, m = "invokeSuspend", v = 2)
public final class uyk extends tje0 implements Function2<myh<? super List<? extends GiftGroup>>, v1b<? super Unit>, Object> {
    public yyk a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yyk e;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"uyk$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sporty/android/core/model/gift/GiftGroup;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends GiftGroup>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyk(v1b v1bVar, yyk yykVar) {
        super(2, v1bVar);
        this.e = yykVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uyk uykVar = new uyk(v1bVar, this.e);
        uykVar.d = obj;
        return uykVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends GiftGroup>> myhVar, v1b<? super Unit> v1bVar) {
        return ((uyk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L47;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
