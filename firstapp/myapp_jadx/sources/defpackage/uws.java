package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.footer.impl.domain.usecase.LoadFooterImagesUseCase$invoke$1", f = "LoadFooterImagesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uws extends tje0 implements iaj<p800, String, String, v1b<? super ooi>, Object> {
    public /* synthetic */ p800 a;
    public /* synthetic */ String b;
    public /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uws(boolean z, boolean z2, boolean z3, v1b<? super uws> v1bVar) {
        super(4, v1bVar);
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.iaj
    public final Object d(p800 p800Var, String str, String str2, v1b<? super ooi> v1bVar) {
        boolean z = this.e;
        boolean z2 = this.f;
        uws uwsVar = new uws(this.d, z, z2, v1bVar);
        uwsVar.a = p800Var;
        uwsVar.b = str;
        uwsVar.c = str2;
        return uwsVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        p800 p800Var = this.a;
        String str = this.b;
        String str2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.d) {
            str2 = null;
        }
        if (!this.e) {
            str = null;
        }
        return new ooi(p800Var, str2, str, this.f ? new ResourceUiText(R.string.main_footer__partnership_banner_img) : null);
    }
}
