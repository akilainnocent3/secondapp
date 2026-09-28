package defpackage;

import android.graphics.drawable.Drawable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface mfb0 {
    ArrayList A(String str, String str2, List list);

    String a();

    default boolean b(String str) {
        return false;
    }

    UiText c();

    Drawable d();

    boolean e();

    String f(String str, String str2, String str3);

    boolean g(String str);

    String getId();

    boolean h();

    boolean i(String str);

    RegularMarketRule j();

    boolean k();

    float l();

    boolean m(String str);

    RegularMarketRule n();

    boolean o(String str);

    String p(String str, String str2, String str3);

    default boolean q(String str) {
        return false;
    }

    default boolean r(String str) {
        return false;
    }

    boolean s();

    void t();

    boolean u();

    List<RegularMarketRule> v();

    boolean w(String str);

    default boolean x(String str) {
        return q(str) || z(str);
    }

    String y();

    default boolean z(String str) {
        return false;
    }
}
