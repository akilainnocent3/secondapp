package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.u;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.flexbox.FlexboxLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.AddFavouriteRequest;
import com.sportygames.lobby.remote.models.AddFavouriteResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.lobby.remote.models.SearchResultResponse;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lhv70;", "Ll12;", "Ljct;", "Lxo80;", "<init>", "()V", "c", "b", "a", "d", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hv70 extends l12<jct, xo80> {
    public a A;
    public pv70 B;
    public b C;
    public boolean D;
    public boolean G;
    public r0t H;
    public nx70 c;
    public nx70 d;
    public d e;
    public ck60 w;
    public LinkedHashMap y;
    public a z;
    public Function0<Unit> f = new vu70();
    public final List<Integer> i = kotlin.collections.b.k(Integer.valueOf(R.array.sg_search_trending_game), Integer.valueOf(R.array.sg_search_top_games), Integer.valueOf(R.array.sg_search_most_played_games));
    public List<c> v = m2g.a;
    public String E = "";
    public final HashMap<String, String> F = new HashMap<>();

    public final class a implements kah {
        public final String a;
        public final gaj<String, Integer, String, Unit> b;

        public a(gaj gajVar, String str) {
            this.a = str;
            this.b = gajVar;
        }

        @Override // defpackage.kah
        public final void R(String str, int i, vo80 vo80Var) {
            vo80Var.getClass();
            this.b.invoke(str, Integer.valueOf(i), this.a);
        }
    }

    public final class b {
        public final InputMethodManager a;

        public b(Context context) {
            Object systemService = context != null ? context.getSystemService("input_method") : null;
            systemService.getClass();
            this.a = (InputMethodManager) systemService;
        }
    }

    public static final class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("RelatedSearchItem(text=", this.a, ", keyword=", this.b, ")");
        }
    }

    public final class d {
        public xo80 a;
        public final Context b;
        public Function0<Unit> c;
        public final f d;
        public final g e;
        public final ck60 f;
        public final b g;
        public final h h;
        public final /* synthetic */ hv70 i;

        public d(hv70 hv70Var, xo80 xo80Var, Context context, Function0 function0, f fVar, g gVar, ck60 ck60Var, b bVar, h hVar) {
            function0.getClass();
            this.i = hv70Var;
            this.a = xo80Var;
            this.b = context;
            this.c = function0;
            this.d = fVar;
            this.e = gVar;
            this.f = ck60Var;
            this.g = bVar;
            this.h = hVar;
        }

        public final void a() {
            Editable text;
            if (!c()) {
                this.c.invoke();
                this.i.p0();
                return;
            }
            d();
            xo80 xo80Var = this.a;
            if (xo80Var != null && (text = xo80Var.v.getText()) != null) {
                text.clear();
            }
            e();
        }

        public final TextView b(final String str, final String str2) {
            str.getClass();
            final TextView textView = null;
            Context context = this.b;
            if (context != null) {
                View viewInflate = View.inflate(context, R.layout.sg_search_suggestion_textview, null);
                viewInflate.getClass();
                textView = (TextView) viewInflate;
                String str3 = (String) kpu.d(new Pair(context.getString(R.string.trending_games), context.getString(R.string.search_trending_cms)), new Pair(context.getString(R.string.top_games), context.getString(R.string.search_top_cms)), new Pair(context.getString(R.string.most_played_games), context.getString(R.string.search_most_played_cms))).get(str);
                textView.setText(str3 != null ? op5.c(op5.a, str3, str) : str);
                if (!str.equalsIgnoreCase(textView.getText().toString())) {
                    HashMap<String, String> map = this.i.F;
                    String lowerCase = textView.getText().toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    map.put(lowerCase, str);
                }
                textView.setGravity(17);
                textView.setOnClickListener(new View.OnClickListener() { // from class: iv70
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        zj60 bridge;
                        String string = textView.getText().toString();
                        string.getClass();
                        xo80 xo80Var = this.a.a;
                        if (xo80Var != null) {
                            xo80Var.v.setText(string);
                        }
                        String str4 = str;
                        str4.getClass();
                        Bundle bundleA = whs.a("searchString", str4, "user_state", SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in");
                        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
                            return;
                        }
                        ((bk60) bridge).a(str2, bundleA);
                    }
                });
            }
            return textView;
        }

        public final boolean c() {
            xo80 xo80Var = this.a;
            if (xo80Var != null && xo80Var.G.getVisibility() == 0) {
                return true;
            }
            xo80 xo80Var2 = this.a;
            if (xo80Var2 != null && xo80Var2.E.getVisibility() == 0) {
                return true;
            }
            xo80 xo80Var3 = this.a;
            if (xo80Var3 != null && xo80Var3.C.getVisibility() == 0) {
                return true;
            }
            xo80 xo80Var4 = this.a;
            return xo80Var4 != null && xo80Var4.K.getVisibility() == 0;
        }

        public final void d() {
            SportyGamesManager sportyGamesManager;
            xnh0 user;
            Map mapL;
            List list;
            String strA = fu5.a("\\s{2,}", StringsKt.t0((String) this.e.invoke()).toString(), " ");
            if (!((Boolean) this.h.invoke()).booleanValue() || strA.length() <= 0 || (sportyGamesManager = SportyGamesManager.getInstance()) == null || (user = sportyGamesManager.getUser()) == null) {
                return;
            }
            String str = user.b;
            hv70 hv70Var = this.i;
            LinkedHashMap linkedHashMap = hv70Var.y;
            ArrayList arrayList = (linkedHashMap == null || (list = (List) linkedHashMap.get(str)) == null) ? new ArrayList() : new ArrayList(list);
            LinkedHashMap linkedHashMapT0 = hv70Var.t0(hv70Var.i, false);
            Locale locale = SportyGamesManager.locale;
            locale.getClass();
            String lowerCase = strA.toLowerCase(locale);
            lowerCase.getClass();
            if (!linkedHashMapT0.containsKey(lowerCase)) {
                arrayList.add(strA);
            }
            List listM0 = CollectionsKt.m0(CollectionsKt.t0(CollectionsKt.N(CollectionsKt.m0(arrayList)), 5));
            LinkedHashMap linkedHashMap2 = hv70Var.y;
            if (linkedHashMap2 != null) {
                linkedHashMap2.put(str, listM0);
            }
            ck60 ck60Var = this.f;
            if (ck60Var != null) {
                LinkedHashMap linkedHashMap3 = hv70Var.y;
                if (linkedHashMap3 != null) {
                    mapL = kpu.l(linkedHashMap3);
                } else {
                    mapL = o2g.a;
                    mapL.getClass();
                }
                ck60Var.c(mapL);
            }
        }

        public final void e() {
            xo80 xo80Var;
            xo80 xo80Var2 = this.a;
            if (xo80Var2 != null) {
                xo80Var2.z.setVisibility(0);
            }
            xo80 xo80Var3 = this.a;
            if (xo80Var3 != null) {
                xo80Var3.J.setVisibility(0);
            }
            xo80 xo80Var4 = this.a;
            if (xo80Var4 != null) {
                xo80Var4.E.setVisibility(8);
            }
            xo80 xo80Var5 = this.a;
            if (xo80Var5 != null) {
                xo80Var5.G.setVisibility(8);
            }
            xo80 xo80Var6 = this.a;
            if (xo80Var6 != null) {
                xo80Var6.C.setVisibility(8);
            }
            xo80 xo80Var7 = this.a;
            if (xo80Var7 != null) {
                xo80Var7.K.setVisibility(8);
            }
            xo80 xo80Var8 = this.a;
            if (xo80Var8 != null) {
                xo80Var8.I.setVisibility(8);
            }
            boolean zBooleanValue = ((Boolean) this.h.invoke()).booleanValue();
            xo80 xo80Var9 = this.a;
            if (!zBooleanValue) {
                if (xo80Var9 != null) {
                    xo80Var9.y.setVisibility(8);
                    return;
                }
                return;
            }
            if (xo80Var9 != null) {
                xo80Var9.y.setVisibility(0);
            }
            List<? extends String> listInvoke = this.d.invoke();
            boolean zIsEmpty = listInvoke.isEmpty();
            xo80 xo80Var10 = this.a;
            if (zIsEmpty) {
                if (xo80Var10 != null) {
                    xo80Var10.y.setVisibility(8);
                    return;
                }
                return;
            }
            if (xo80Var10 != null) {
                xo80Var10.y.setVisibility(0);
            }
            xo80 xo80Var11 = this.a;
            if (xo80Var11 != null) {
                xo80Var11.d.removeAllViewsInLayout();
            }
            for (String str : CollectionsKt.m0(listInvoke)) {
                if (str.length() > 0 && (xo80Var = this.a) != null) {
                    xo80Var.d.addView(b(str, "RecentSearch"));
                }
            }
            xo80 xo80Var12 = this.a;
            if (xo80Var12 == null) {
                return;
            }
            Iterator<View> it = new r7i0(xo80Var12.d).iterator();
            while (true) {
                t7i0 t7i0Var = (t7i0) it;
                if (!t7i0Var.hasNext()) {
                    return;
                }
                View view = (View) t7i0Var.next();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.getClass();
                FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                layoutParams2.b = 1.0f;
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<List<? extends String>> {
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            xnh0 user;
            hv70 hv70Var = (hv70) this.receiver;
            ck60 ck60Var = hv70Var.w;
            hv70Var.y = ck60Var != null ? new LinkedHashMap(ck60Var.a()) : null;
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager != null && (user = sportyGamesManager.getUser()) != null) {
                String str = user.b;
                LinkedHashMap linkedHashMap = hv70Var.y;
                List<? extends String> list = linkedHashMap != null ? (List) linkedHashMap.get(str) : null;
                if (list != null) {
                    return list;
                }
            }
            return m2g.a;
        }
    }

    public static final /* synthetic */ class g extends saj implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((hv70) this.receiver).E;
        }
    }

    public static final /* synthetic */ class h extends saj implements Function0<Boolean> {
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((hv70) this.receiver).D);
        }
    }

    public static final /* synthetic */ class i extends saj implements gaj<String, Integer, String, Unit> {
        @Override // defpackage.gaj
        public final Unit invoke(String str, Integer num, String str2) {
            String str3 = str;
            int iIntValue = num.intValue();
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            ((hv70) this.receiver).r0(iIntValue, str3, str4);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class j extends saj implements gaj<String, Integer, String, Unit> {
        @Override // defpackage.gaj
        public final Unit invoke(String str, Integer num, String str2) {
            String str3 = str;
            int iIntValue = num.intValue();
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            ((hv70) this.receiver).r0(iIntValue, str3, str4);
            return Unit.a;
        }
    }

    public static final class k implements lfy, paj {
        public final /* synthetic */ tig a;

        public k(tig tigVar) {
            this.a = tigVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static ArrayList s0(List list) {
        boolean zG;
        int i2;
        Long minimumSdkVersion;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            GameDetails gameDetails = (GameDetails) obj;
            gameDetails.getClass();
            try {
                Integer launchRate = gameDetails.getLaunchRate();
                if (launchRate != null) {
                    int iIntValue = launchRate.intValue();
                    String name = gameDetails.getName();
                    zG = Intrinsics.g(name != null ? Boolean.valueOf(new brr().a(iIntValue, name)) : null, Boolean.TRUE);
                } else {
                    zG = false;
                }
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            int i3 = gameDetails.getNativeSupportVersion() != null ? Integer.parseInt(gameDetails.getNativeSupportVersion()) : 0;
            if (gameDetails.getLaunchRate() != null && gameDetails.getLaunchRate().intValue() > 0 && zG && (i2 = Build.VERSION.SDK_INT) >= i3) {
                LobbyMetaInfo metaInfo = gameDetails.getMetaInfo();
                if (i2 >= ((metaInfo == null || (minimumSdkVersion = metaInfo.getMinimumSdkVersion()) == null) ? 0L : minimumSdkVersion.longValue())) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_lobby_search_fragment, (ViewGroup) null, false);
        int i2 = R.id.close_search;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close_search, viewInflate);
        if (appCompatImageView != null) {
            i2 = R.id.divider_search;
            View viewA = h5e.a(R.id.divider_search, viewInflate);
            if (viewA != null) {
                i2 = R.id.search_history_items;
                FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.search_history_items, viewInflate);
                if (flexboxLayout != null) {
                    i2 = R.id.search_history_label;
                    TextView textView = (TextView) h5e.a(R.id.search_history_label, viewInflate);
                    if (textView != null) {
                        i2 = R.id.search_suggestion_items;
                        FlexboxLayout flexboxLayout2 = (FlexboxLayout) h5e.a(R.id.search_suggestion_items, viewInflate);
                        if (flexboxLayout2 != null) {
                            i2 = R.id.search_suggestion_label;
                            TextView textView2 = (TextView) h5e.a(R.id.search_suggestion_label, viewInflate);
                            if (textView2 != null) {
                                i2 = R.id.sg_lobby_search_text;
                                EditText editText = (EditText) h5e.a(R.id.sg_lobby_search_text, viewInflate);
                                if (editText != null) {
                                    i2 = R.id.sg_search_error_text;
                                    TextView textView3 = (TextView) h5e.a(R.id.sg_search_error_text, viewInflate);
                                    if (textView3 != null) {
                                        i2 = R.id.sg_search_history_container;
                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.sg_search_history_container, viewInflate);
                                        if (linearLayout != null) {
                                            i2 = R.id.sg_search_input_container;
                                            if (((LinearLayout) h5e.a(R.id.sg_search_input_container, viewInflate)) != null) {
                                                i2 = R.id.sg_search_input_history_suggestion;
                                                RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.sg_search_input_history_suggestion, viewInflate);
                                                if (relativeLayout != null) {
                                                    i2 = R.id.sg_search_not_match_text;
                                                    TextView textView4 = (TextView) h5e.a(R.id.sg_search_not_match_text, viewInflate);
                                                    if (textView4 != null) {
                                                        i2 = R.id.sg_search_remaining_space;
                                                        LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.sg_search_remaining_space, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i2 = R.id.sg_search_result;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.sg_search_result, viewInflate);
                                                            if (relativeLayout2 != null) {
                                                                i2 = R.id.sg_search_result_divider;
                                                                View viewA2 = h5e.a(R.id.sg_search_result_divider, viewInflate);
                                                                if (viewA2 != null) {
                                                                    i2 = R.id.sg_search_result_error;
                                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.sg_search_result_error, viewInflate);
                                                                    if (linearLayout3 != null) {
                                                                        i2 = R.id.sg_search_result_list;
                                                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.sg_search_result_list, viewInflate);
                                                                        if (recyclerView != null) {
                                                                            i2 = R.id.sg_search_result_not_found;
                                                                            LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.sg_search_result_not_found, viewInflate);
                                                                            if (linearLayout4 != null) {
                                                                                i2 = R.id.sg_search_result_title;
                                                                                TextView textView5 = (TextView) h5e.a(R.id.sg_search_result_title, viewInflate);
                                                                                if (textView5 != null) {
                                                                                    i2 = R.id.sg_search_spin_kit;
                                                                                    if (((SpinKitView) h5e.a(R.id.sg_search_spin_kit, viewInflate)) != null) {
                                                                                        i2 = R.id.sg_search_spin_kit_parent;
                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) h5e.a(R.id.sg_search_spin_kit_parent, viewInflate);
                                                                                        if (relativeLayout3 != null) {
                                                                                            i2 = R.id.sg_search_suggestion_container;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.sg_search_suggestion_container, viewInflate);
                                                                                            if (linearLayout5 != null) {
                                                                                                i2 = R.id.sg_search_tag_container;
                                                                                                if (((LinearLayout) h5e.a(R.id.sg_search_tag_container, viewInflate)) != null) {
                                                                                                    i2 = R.id.sg_you_may_like;
                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) h5e.a(R.id.sg_you_may_like, viewInflate);
                                                                                                    if (relativeLayout4 != null) {
                                                                                                        i2 = R.id.sg_you_may_like_list;
                                                                                                        RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.sg_you_may_like_list, viewInflate);
                                                                                                        if (recyclerView2 != null) {
                                                                                                            i2 = R.id.sg_you_may_like_title;
                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.sg_you_may_like_title, viewInflate);
                                                                                                            if (textView6 != null) {
                                                                                                                return new xo80((LinearLayout) viewInflate, appCompatImageView, viewA, flexboxLayout, textView, flexboxLayout2, textView2, editText, textView3, linearLayout, relativeLayout, textView4, linearLayout2, relativeLayout2, viewA2, linearLayout3, recyclerView, linearLayout4, textView5, relativeLayout3, linearLayout5, relativeLayout4, recyclerView2, textView6);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.l12, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        p0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        p0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ssw<LoadingState<HTTPResponse<SearchResultResponse>>> sswVar;
        xo80 xo80Var;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        this.w = context != null ? new ck60(context, "sg_user_search") : null;
        int i2 = 1;
        LinkedHashMap linkedHashMapT0 = t0(this.i, true);
        ArrayList arrayList = new ArrayList(linkedHashMapT0.size());
        for (Map.Entry entry : linkedHashMapT0.entrySet()) {
            arrayList.add(new c((String) entry.getValue(), (String) entry.getKey()));
        }
        this.v = arrayList;
        this.C = new b(getContext());
        d dVar = new d(this, (xo80) this.b, getContext(), this.f, new f(0, this, hv70.class, "getUserSearchHistory", "getUserSearchHistory()Ljava/util/List;", 0), new g(0, this, hv70.class, "getLastSearchText", "getLastSearchText()Ljava/lang/String;", 0), this.w, this.C, new h(0, this, hv70.class, "getUserLoggedIn", "getUserLoggedIn()Z", 0));
        this.e = dVar;
        dVar.e();
        d dVar2 = this.e;
        if (dVar2 != null) {
            xo80 xo80Var2 = dVar2.a;
            if (xo80Var2 != null) {
                xo80Var2.v.requestFocus();
            }
            xo80 xo80Var3 = dVar2.a;
            if (xo80Var3 != null) {
                ej5.c(ebs.a(dVar2.i.getLifecycle()), null, null, new jv70(dVar2, xo80Var3.v, null), 3);
            }
        }
        d dVar3 = this.e;
        if (dVar3 != null) {
            List<c> list = this.v;
            list.getClass();
            xo80 xo80Var4 = dVar3.a;
            if (xo80Var4 != null) {
                xo80Var4.f.removeAllViewsInLayout();
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TextView textViewB = dVar3.b(((c) it.next()).a, "SearchSuggestion");
                if (textViewB != null && (xo80Var = dVar3.a) != null) {
                    xo80Var.f.addView(textViewB);
                }
            }
            xo80 xo80Var5 = dVar3.a;
            if (xo80Var5 != null) {
                Iterator<View> it2 = new r7i0(xo80Var5.f).iterator();
                while (true) {
                    t7i0 t7i0Var = (t7i0) it2;
                    if (!t7i0Var.hasNext()) {
                        break;
                    }
                    View view2 = (View) t7i0Var.next();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.getClass();
                    FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                    layoutParams2.b = 1.0f;
                    view2.setLayoutParams(layoutParams2);
                }
            }
        }
        xo80 xo80Var6 = (xo80) this.b;
        if (xo80Var6 != null) {
            xo80Var6.b.setOnClickListener(new View.OnClickListener() { // from class: gu70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    hv70.d dVar4 = this.a.e;
                    if (dVar4 != null) {
                        dVar4.a();
                    }
                }
            });
        }
        this.z = new a(new i(3, this, hv70.class, "favouriteClick", "favouriteClick(Ljava/lang/String;ILjava/lang/String;)V", 0), "SearchResult");
        this.A = new a(new j(3, this, hv70.class, "favouriteClick", "favouriteClick(Ljava/lang/String;ILjava/lang/String;)V", 0), "YouMayLikeResult");
        pv70 pv70Var = new pv70(this);
        this.B = pv70Var;
        xo80 xo80Var7 = (xo80) this.b;
        if (xo80Var7 != null) {
            xo80Var7.v.addTextChangedListener(pv70Var);
        }
        xo80 xo80Var8 = (xo80) this.b;
        if (xo80Var8 != null) {
            xo80Var8.v.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: av70
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                    if (i3 != 3) {
                        return false;
                    }
                    hv70.b bVar = this.a.C;
                    if (bVar == null) {
                        return true;
                    }
                    textView.getClass();
                    if (hv70.this.getContext() == null) {
                        return true;
                    }
                    bVar.a.hideSoftInputFromWindow(textView.getWindowToken(), 2);
                    return true;
                }
            });
        }
        xo80 xo80Var9 = (xo80) this.b;
        if (xo80Var9 != null) {
            xo80Var9.v.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: bv70
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view3, boolean z) {
                    hv70.b bVar;
                    if (z || (bVar = this.a.C) == null) {
                        return;
                    }
                    view3.getClass();
                    if (hv70.this.getContext() != null) {
                        bVar.a.hideSoftInputFromWindow(view3.getWindowToken(), 2);
                    }
                }
            });
        }
        jct jctVar = (jct) this.a;
        if (jctVar != null && (sswVar = jctVar.I) != null) {
            sswVar.f(getViewLifecycleOwner(), new k(new tig(this, i2)));
        }
        xo80 xo80Var10 = (xo80) this.b;
        op5.r(op5.a, kotlin.collections.b.f(xo80Var10 != null ? xo80Var10.v : null, xo80Var10 != null ? xo80Var10.A : null, xo80Var10 != null ? xo80Var10.w : null, xo80Var10 != null ? xo80Var10.e : null, xo80Var10 != null ? xo80Var10.i : null, xo80Var10 != null ? xo80Var10.M : null), null, 4);
        xo80 xo80Var11 = (xo80) this.b;
        if (xo80Var11 != null) {
            xo80Var11.B.setOnClickListener(new yhg(this, 1));
        }
    }

    public final void p0() {
        d dVar = this.e;
        if (dVar != null) {
            dVar.d();
        }
        d dVar2 = this.e;
        if (dVar2 != null) {
            dVar2.a = null;
            dVar2.c = new hcl(1);
        }
        xo80 xo80Var = (xo80) this.b;
        if (xo80Var != null) {
            xo80Var.v.removeTextChangedListener(this.B);
        }
        nx70 nx70Var = this.c;
        if (nx70Var != null) {
            nx70Var.c = null;
        }
        nx70 nx70Var2 = this.d;
        if (nx70Var2 != null) {
            nx70Var2.c = null;
        }
        xo80 xo80Var2 = (xo80) this.b;
        if (xo80Var2 != null) {
            xo80Var2.F.setAdapter(null);
        }
        xo80 xo80Var3 = (xo80) this.b;
        if (xo80Var3 != null) {
            xo80Var3.L.setAdapter(null);
        }
        this.e = null;
        this.f = new xu70();
        this.c = null;
        this.d = null;
        this.B = null;
        this.w = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.a = null;
        this.b = null;
    }

    public final void q0() {
        jct jctVar = (jct) this.a;
        if (jctVar != null) {
            r750.b(jctVar, 1200L, new hhq(this, 1));
        }
    }

    public final void r0(int i2, String str, String str2) {
        final nx70 nx70Var;
        Integer numValueOf;
        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar;
        ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> sswVar2;
        if (this.G) {
            return;
        }
        this.G = true;
        if (str2.equals("SearchResult")) {
            nx70Var = this.c;
        } else {
            nx70Var = str2.equals("YouMayLikeResult") ? this.d : null;
        }
        if (nx70Var == null) {
            numValueOf = null;
            break;
        }
        List<GameDetails> list = nx70Var.f;
        Iterator<T> it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                numValueOf = null;
                break;
            }
            int i4 = i3 + 1;
            if (String.valueOf(((GameDetails) it.next()).getId()).equals(str) && i3 < list.size()) {
                numValueOf = Integer.valueOf(i3);
                break;
            }
            i3 = i4;
        }
        if (numValueOf != null) {
            if (i2 == 1) {
                if (nx70Var != null) {
                    nx70Var.i(numValueOf.intValue(), true);
                }
                final int iIntValue = numValueOf.intValue();
                jct jctVar = (jct) this.a;
                if (jctVar != null && (sswVar2 = jctVar.c) != null) {
                    sswVar2.f(getViewLifecycleOwner(), new lfy() { // from class: cv70
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> sswVar3;
                            Integer code;
                            LoadingState loadingState = (LoadingState) obj;
                            int i5 = hv70.e.a[loadingState.getStatus().ordinal()];
                            hv70 hv70Var = this.a;
                            if (i5 == 1) {
                                hv70Var.q0();
                                return;
                            }
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    return;
                                }
                                uhc.a();
                                return;
                            }
                            nx70 nx70Var2 = nx70Var;
                            if (nx70Var2 != null) {
                                List<GameDetails> list2 = nx70Var2.f;
                                int i6 = iIntValue;
                                GameDetails gameDetails = list2.get(i6);
                                gameDetails.setFavourite(false);
                                gameDetails.setFavouriteMessage("Error! Please try again");
                                gameDetails.setFavouriteRun(true);
                                nx70Var2.notifyItemChanged(i6);
                            }
                            ResultWrapper.GenericError error = loadingState.getError();
                            if (error != null && (code = error.getCode()) != null && code.intValue() == 403) {
                                r0t r0tVar = hv70Var.H;
                                if (r0tVar != null) {
                                    r0tVar.a0();
                                }
                                hv70Var.u0(false);
                            }
                            jct jctVar2 = (jct) hv70Var.a;
                            if (jctVar2 != null && (sswVar3 = jctVar2.c) != null) {
                                sswVar3.l(hv70Var.getViewLifecycleOwner());
                            }
                            hv70Var.q0();
                        }
                    });
                }
                jct jctVar2 = (jct) this.a;
                if (jctVar2 != null) {
                    ej5.c(o8i0.d(jctVar2), null, null, new kct(jctVar2, new AddFavouriteRequest(str), u.a("type", str2), null), 3);
                    return;
                }
                return;
            }
            if (nx70Var != null) {
                nx70Var.i(numValueOf.intValue(), false);
            }
            final int iIntValue2 = numValueOf.intValue();
            jct jctVar3 = (jct) this.a;
            if (jctVar3 != null && (sswVar = jctVar3.e) != null) {
                sswVar.f(getViewLifecycleOwner(), new lfy() { // from class: ev70
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar3;
                        Integer code;
                        LoadingState loadingState = (LoadingState) obj;
                        int i5 = hv70.e.a[loadingState.getStatus().ordinal()];
                        hv70 hv70Var = this.a;
                        if (i5 == 1) {
                            hv70Var.q0();
                            return;
                        }
                        if (i5 != 2) {
                            return;
                        }
                        nx70 nx70Var2 = nx70Var;
                        if (nx70Var2 != null) {
                            List<GameDetails> list2 = nx70Var2.f;
                            int i6 = iIntValue2;
                            GameDetails gameDetails = list2.get(i6);
                            gameDetails.setFavourite(true);
                            gameDetails.setFavouriteMessage("Error! Please try again");
                            gameDetails.setFavouriteRun(true);
                            nx70Var2.notifyItemChanged(i6);
                        }
                        ResultWrapper.GenericError error = loadingState.getError();
                        if (error != null && (code = error.getCode()) != null && code.intValue() == 403) {
                            r0t r0tVar = hv70Var.H;
                            if (r0tVar != null) {
                                r0tVar.a0();
                            }
                            hv70Var.u0(false);
                        }
                        jct jctVar4 = (jct) hv70Var.a;
                        if (jctVar4 != null && (sswVar3 = jctVar4.e) != null) {
                            sswVar3.l(hv70Var.getViewLifecycleOwner());
                        }
                        hv70Var.q0();
                    }
                });
            }
            jct jctVar4 = (jct) this.a;
            if (jctVar4 != null) {
                jctVar4.x1(new AddFavouriteRequest(str), jpu.b(new Pair("type", str2)));
            }
        }
    }

    public final LinkedHashMap t0(List list, boolean z) {
        String str;
        Pair pair;
        String str2;
        String str3;
        String str4;
        Resources resources;
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            androidx.fragment.app.e activity = getActivity();
            String[] stringArray = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getStringArray(iIntValue);
            String str5 = "";
            if (z) {
                if (stringArray == null || (str3 = stringArray[0]) == null) {
                    str3 = "";
                }
                if (stringArray != null && (str4 = stringArray[1]) != null) {
                    str5 = str4;
                }
                pair = new Pair(str3, str5);
            } else {
                if (stringArray == null || (str = stringArray[0]) == null) {
                    str = "";
                }
                Locale locale = SportyGamesManager.locale;
                String strA = gvf.a(locale, str, locale);
                if (stringArray != null && (str2 = stringArray[1]) != null) {
                    str5 = str2;
                }
                Locale locale2 = SportyGamesManager.locale;
                pair = new Pair(strA, gvf.a(locale2, str5, locale2));
            }
            arrayList.add(pair);
        }
        Map mapK = kpu.k(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapK.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void u0(boolean z) {
        this.D = z;
        xo80 xo80Var = (xo80) this.b;
        if ((xo80Var != null ? xo80Var.v.getText() : null) != null) {
            xo80 xo80Var2 = (xo80) this.b;
            if (String.valueOf(xo80Var2 != null ? xo80Var2.v.getText() : null).length() >= 3) {
                xo80 xo80Var3 = (xo80) this.b;
                int length = String.valueOf(xo80Var3 != null ? xo80Var3.v.getTag() : null).length();
                VM vm = this.a;
                if (length > 0) {
                    jct jctVar = (jct) vm;
                    if (jctVar != null) {
                        xo80 xo80Var4 = (xo80) this.b;
                        jctVar.D1(String.valueOf(xo80Var4 != null ? xo80Var4.v.getTag() : null));
                        return;
                    }
                    return;
                }
                jct jctVar2 = (jct) vm;
                if (jctVar2 != null) {
                    xo80 xo80Var5 = (xo80) this.b;
                    jctVar2.D1(String.valueOf(xo80Var5 != null ? xo80Var5.v.getText() : null));
                    return;
                }
                return;
            }
        }
        d dVar = this.e;
        if (dVar == null || dVar.c()) {
            return;
        }
        dVar.e();
    }
}
