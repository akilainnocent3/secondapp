package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.EventDetailsNavigation;
import com.sportybet.plugin.realsports.prematch.data.EventSideMenu;
import com.sportybet.plugin.realsports.prematch.data.NavigationUiEvent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ya20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [xb20] */
    /* JADX WARN: Type inference failed for: r2v3, types: [yb20] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                final EventSideMenu eventSideMenu = (EventSideMenu) obj;
                int i2 = PreMatchEventActivity.a2;
                if (eventSideMenu != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    preMatchEventActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    View viewFindViewById = preMatchEventActivity.findViewById(R.id.events_side_menu_container);
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    DrawerLayout.LayoutParams layoutParams2 = layoutParams instanceof DrawerLayout.LayoutParams ? (DrawerLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) (((double) displayMetrics.widthPixels) * 0.7d);
                        viewFindViewById.setLayoutParams(layoutParams2);
                    }
                    ComposeView composeView = preMatchEventActivity.n0;
                    if (composeView != null) {
                        final ?? r1 = new Function0() { // from class: xb20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                DrawerLayout drawerLayout = preMatchEventActivity.r1;
                                if (drawerLayout != null) {
                                    drawerLayout.e(false);
                                }
                                return Unit.a;
                            }
                        };
                        final ?? r2 = new Function2() { // from class: yb20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Object next;
                                String str = (String) obj3;
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                int i3 = PreMatchEventActivity.a2;
                                str.getClass();
                                of20 of20Var = preMatchEventActivity.R0;
                                if (of20Var != null) {
                                    vu90<NavigationUiEvent> vu90Var = of20Var.e0;
                                    Object obj5 = null;
                                    if (zBooleanValue) {
                                        Iterator<T> it = of20Var.n0.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!Intrinsics.g(((Event) next).eventId, str));
                                        Event event = (Event) next;
                                        if (event != null) {
                                            String str2 = event.eventId;
                                            str2.getClass();
                                            vu90Var.m(new NavigationUiEvent.LiveNavigation(str2, false, 2, null));
                                        }
                                    } else {
                                        for (Object obj6 : of20Var.o0) {
                                            if (Intrinsics.g(((Event) obj6).eventId, str)) {
                                                obj5 = obj6;
                                                break;
                                            }
                                        }
                                        Event event2 = (Event) obj5;
                                        if (event2 != null) {
                                            vu90Var.m(new NavigationUiEvent.PreMatchNavigation(event2, EventDetailsNavigation.DIRECT));
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        composeView.setContent(new op8(-168975935, new Function2() { // from class: yng
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final EventSideMenu eventSideMenu2 = eventSideMenu;
                                    final xb20 xb20Var = r1;
                                    final yb20 yb20Var = r2;
                                    scv.b(null, null, null, pp8.b(-423073171, new Function2() { // from class: bog
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            a aVar2 = (a) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                qog.a(eventSideMenu2, xb20Var, yb20Var, aVar2, EventSideMenu.$stable);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar), aVar, 3072, 7);
                                } else {
                                    aVar.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                    }
                }
                break;
            default:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                Integer intOrNull = StringsKt.toIntOrNull(str);
                function1.invoke(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
                break;
        }
        return Unit.a;
    }
}
