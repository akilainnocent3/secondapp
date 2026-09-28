package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.SocialRouter$SocialNetworkSuggested;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkfa0;", "Lavw;", "Ljfa0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kfa0 extends avw<jfa0> {
    public final vga0 e;
    public final bnh0 f;
    public final iym i;
    public final SocialRouter$SocialNetworkSuggested.Data v;

    @c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$1", f = "SocialNetworkSuggestedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {

        /* JADX INFO: renamed from: kfa0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0764a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[xia0.values().length];
                try {
                    xia0 xia0Var = xia0.a;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    xia0 xia0Var2 = xia0.a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return kfa0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            jfa0 jfa0Var;
            xia0 type;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            kfa0 kfa0Var = kfa0.this;
            wwd0 wwd0Var = kfa0Var.a;
            do {
                value = wwd0Var.getValue();
                jfa0Var = (jfa0) value;
                type = kfa0Var.v.getType();
            } while (!wwd0Var.g(value, jfa0.a(jfa0Var, null, null, false, (type == null ? -1 : C0764a.a[type.ordinal()]) != 1 ? R.string.personal_page__suggested_follow_accounts : R.string.personal_page__high_win_players, 15)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa0(vga0 vga0Var, bnh0 bnh0Var, vu60 vu60Var, iym iymVar) {
        Object bVar;
        super(new jfa0(0));
        vga0Var.getClass();
        bnh0Var.getClass();
        vu60Var.getClass();
        iymVar.getClass();
        this.e = vga0Var;
        this.f = bnh0Var;
        this.i = iymVar;
        SocialRouter$SocialNetworkSuggested.a.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = (SocialRouter$SocialNetworkSuggested.Data) vu60Var.b("args_social_network_suggested_data");
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        SocialRouter$SocialNetworkSuggested.Data data = (SocialRouter$SocialNetworkSuggested.Data) (bVar instanceof zi50.b ? null : bVar);
        if (data == null) {
            SocialRouter$SocialNetworkSuggested.Data.INSTANCE.getClass();
            data = SocialRouter$SocialNetworkSuggested.Data.EMPTY;
        }
        this.v = data;
        y1(new a(null));
        y1(new lfa0(this, new ijf0("", 0L, 6), null));
    }
}
