package defpackage;

import com.sportybet.plugin.sportystories.data.entity.StorySetApiModel;
import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.data.repository.SportyStoriesRepositoryImpl$getStories$2", f = "SportyStoriesRepositoryImpl.kt", l = {22, 24}, m = "invokeSuspend", v = 2)
public final class zbd0 extends tje0 implements Function2<v5b, v1b<? super List<? extends Story>>, Object> {
    public ojd a;
    public Collection b;
    public Iterator c;
    public StorySetApiModel d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ acd0 i;

    @c0d(c = "com.sportybet.plugin.sportystories.data.repository.SportyStoriesRepositoryImpl$getStories$2$cmsMap$1", f = "SportyStoriesRepositoryImpl.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Map<String, ? extends String>>, Object> {
        public int a;
        public final /* synthetic */ acd0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(acd0 acd0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = acd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Map<String, ? extends String>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ou7 ou7Var = this.b.b;
            this.a = 1;
            Object objA = ou7Var.a("sporty_stories", this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbd0(acd0 acd0Var, v1b<? super zbd0> v1bVar) {
        super(2, v1bVar);
        this.i = acd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zbd0 zbd0Var = new zbd0(this.i, v1bVar);
        zbd0Var.f = obj;
        return zbd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends Story>> v1bVar) {
        return ((zbd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:(1:6)(2:7|8))(1:9)|19|65|20|(1:22)(13:23|(4:26|(3:68|28|71)(1:70)|69|24)|67|31|(3:33|(2:35|73)(1:74)|36)|72|37|(1:52)(3:39|(1:41)(1:42)|(1:52)(3:46|(1:48)(1:49)|(1:52)))|51|53|56|(1:58)|59)|(1:61)|62|14|(1:16)(2:63|64)) */
    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:20:0x008b, B:23:0x009c, B:24:0x00a9, B:26:0x00af, B:28:0x00bb, B:31:0x00c2, B:33:0x00ce, B:35:0x00e1, B:36:0x00eb, B:37:0x00fa, B:39:0x0100, B:44:0x010a, B:46:0x0112, B:53:0x0123, B:52:0x011e), top: B:65:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r3 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
    
        r4 = defpackage.zi50.b;
        r8 = new zi50.b(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
