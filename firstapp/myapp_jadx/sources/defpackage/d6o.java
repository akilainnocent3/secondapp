package defpackage;

import android.graphics.Picture;
import com.sporty.android.core.model.social.ShareIntentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffDialogFragment$onShareItemClicked$1", f = "InstantVirtualShowOffDialogFragment.kt", l = {245, 259}, m = "invokeSuspend", v = 2)
public final class d6o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q5o c;
    public final /* synthetic */ Picture d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ShareIntentType f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ShareIntentType.values().length];
            try {
                iArr[ShareIntentType.TWITTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareIntentType.FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareIntentType.WHATSAPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareIntentType.TELEGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6o(q5o q5oVar, Picture picture, String str, ShareIntentType shareIntentType, v1b<? super d6o> v1bVar) {
        super(2, v1bVar);
        this.c = q5oVar;
        this.d = picture;
        this.e = str;
        this.f = shareIntentType;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d6o d6oVar = new d6o(this.c, this.d, this.e, this.f, v1bVar);
        d6oVar.b = obj;
        return d6oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d6o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r10 == r1) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
