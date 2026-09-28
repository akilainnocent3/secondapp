package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.notification.NotificationSetting;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr4y;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r4y extends j8i0 {
    public final qa30 a;
    public final ku90<com.sporty.android.common.uievent.a> b;
    public final t340 c;
    public final ku90<k4y> d;
    public final t340 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsViewModel$uiState$1", f = "NotificationSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<lk50<? extends List<? extends NotificationSetting>>, Boolean, Set<? extends String>, v1b<? super j4y>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Set c;

        @Override // defpackage.iaj
        public final Object d(lk50<? extends List<? extends NotificationSetting>> lk50Var, Boolean bool, Set<? extends String> set, v1b<? super j4y> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(4, v1bVar);
            aVar.a = lk50Var;
            aVar.b = zBooleanValue;
            aVar.c = set;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            lk50 lk50Var = this.a;
            boolean z2 = this.b;
            Set set = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(lk50Var instanceof lk50.c)) {
                return j4y.a.a;
            }
            List<NotificationSetting> list = (List) ((lk50.c) lk50Var).a;
            list.getClass();
            set.getClass();
            if (list.isEmpty()) {
                z = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (((NotificationSetting) it.next()).getEnabled()) {
                    z = false;
                    break;
                }
            }
            boolean z3 = !z;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (NotificationSetting notificationSetting : list) {
                notificationSetting.getClass();
                arrayList.add(notificationSetting.getNotificationType() == 1 ? new t3y.a(notificationSetting.getNotificationType(), vch0.d(notificationSetting.getNotificationTypeDisplayName()), notificationSetting.isNew() && !set.contains(String.valueOf(notificationSetting.getNotificationType()))) : new t3y.b(notificationSetting.getNotificationType(), vch0.d(notificationSetting.getNotificationTypeDisplayName()), notificationSetting.getEnabled(), notificationSetting.isNew() && !set.contains(String.valueOf(notificationSetting.getNotificationType()))));
            }
            return new j4y.b(arrayList, !z2, z3);
        }
    }

    public r4y(qa30 qa30Var) {
        qa30Var.getClass();
        this.a = qa30Var;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.b = ku90Var;
        this.c = e1i.a(ku90Var);
        ku90<k4y> ku90Var2 = new ku90<>();
        this.d = ku90Var2;
        this.e = e1i.a(ku90Var2);
        lyh<lk50<List<NotificationSetting>>> lyhVarE = qa30Var.e(pu0.b.a);
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarE, et7VarD, kwd0Var, bVar);
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.f = wwd0VarA;
        this.i = e1i.e(r1i.a(v340VarE, wwd0VarA, qa30Var.f(), new a(4, null)), o8i0.d(this), kwd0Var, j4y.a.a);
    }

    public final void x1(UiText uiText) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__error);
        if (uiText == null) {
            uiText = vch0.b;
        }
        b.e(this.b, resourceUiText, null, uiText, null, null, null, new jsj(this, 1), r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
    }
}
