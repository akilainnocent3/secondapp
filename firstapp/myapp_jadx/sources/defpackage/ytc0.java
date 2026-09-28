package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.data.CategoryItem;
import com.sporty.android.sportynews.data.TagItem;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class ytc0 {

    public static final class b extends ClickableSpan {
        public final /* synthetic */ TagItem a;
        public final /* synthetic */ mr7 b;

        public static final class a implements View.OnClickListener {
            public final /* synthetic */ cq40 a;
            public final /* synthetic */ TagItem b;
            public final /* synthetic */ mr7 c;

            public a(mr7 mr7Var, cq40 cq40Var, TagItem tagItem) {
                this.a = cq40Var;
                this.b = tagItem;
                this.c = mr7Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                cq40 cq40Var = this.a;
                if (jCurrentTimeMillis - cq40Var.a < 350) {
                    return;
                }
                cq40Var.a = jCurrentTimeMillis;
                view.getClass();
                TagItem tagItem = this.b;
                if (tagItem != null) {
                    this.c.a(tagItem);
                }
            }
        }

        public b(mr7 mr7Var, TagItem tagItem) {
            this.a = tagItem;
            this.b = mr7Var;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            view.getClass();
            view.setOnClickListener(new a(this.b, new cq40(), this.a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setUnderlineText(false);
        }
    }

    public static final class c extends ClickableSpan {
        public final /* synthetic */ mr7 a;
        public final /* synthetic */ TagItem b;

        public static final class a implements View.OnClickListener {
            public final /* synthetic */ cq40 a;
            public final /* synthetic */ mr7 b;
            public final /* synthetic */ TagItem c;

            public a(mr7 mr7Var, cq40 cq40Var, TagItem tagItem) {
                this.a = cq40Var;
                this.b = mr7Var;
                this.c = tagItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                cq40 cq40Var = this.a;
                if (jCurrentTimeMillis - cq40Var.a < 350) {
                    return;
                }
                cq40Var.a = jCurrentTimeMillis;
                view.getClass();
                this.b.a(this.c);
            }
        }

        public c(mr7 mr7Var, TagItem tagItem) {
            this.a = mr7Var;
            this.b = tagItem;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            view.getClass();
            view.setOnClickListener(new a(this.a, new cq40(), this.b));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setUnderlineText(false);
        }
    }

    public static String a(String str, String str2) {
        Uri uriBuild = Uri.parse(str2);
        if (uriBuild.getQueryParameter("theme") == null) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("theme", str).build();
        }
        String string = uriBuild.toString();
        string.getClass();
        return string;
    }

    public static String b(Context context, long j) {
        context.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
            return sn5.b(context, R.string.sporty_news__article_duration_now, new Object[0]);
        }
        if (jCurrentTimeMillis < 3600000) {
            return sn5.b(context, R.string.sporty_news__article_duration_mins, String.valueOf(jCurrentTimeMillis / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS));
        }
        if (jCurrentTimeMillis < 86400000) {
            return sn5.b(context, R.string.sporty_news__article_duration_hours, String.valueOf(jCurrentTimeMillis / 3600000));
        }
        if (jCurrentTimeMillis < 2592000000L) {
            return sn5.b(context, R.string.sporty_news__article_duration_days, String.valueOf(jCurrentTimeMillis / 86400000));
        }
        String str = new SimpleDateFormat("d MMM, yyyy", Locale.getDefault()).format(new Date(j));
        str.getClass();
        return str;
    }

    public static void c(TabLayout tabLayout, List list, boolean z, int i, Function1 function1) {
        list.getClass();
        tabLayout.n();
        tabLayout.e0.clear();
        tabLayout.a(new a(z, function1));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            CategoryItem categoryItem = (CategoryItem) obj;
            krc0 krc0VarA = krc0.a(LayoutInflater.from(tabLayout.getContext()));
            TextView textView = krc0VarA.c;
            textView.setText(categoryItem.getName());
            textView.setTextColor(tabLayout.getContext().getColor(R.color.text_type1_tertiary));
            krc0VarA.b.setVisibility(Intrinsics.g(categoryItem.getName(), "Livescore") ? 0 : 8);
            TabLayout.g gVarL = tabLayout.l();
            gVarL.c(krc0VarA.a);
            gVarL.a = categoryItem.getId();
            tabLayout.d(gVarL, i2 == i);
            i2 = i3;
        }
    }

    public static SpannableStringBuilder d(Context context, TagItem tagItem, mr7 mr7Var) {
        context.getClass();
        mr7Var.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b bVar = new b(mr7Var, tagItem);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (tagItem != null ? tagItem.getName() : null));
        spannableStringBuilder.setSpan(bVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.brand_quaternary)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder e(Context context, List list, String str, mr7 mr7Var) {
        context.getClass();
        list.getClass();
        mr7Var.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            TagItem tagItem = (TagItem) obj;
            c cVar = new c(mr7Var, tagItem);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) tagItem.getName());
            spannableStringBuilder.setSpan(cVar, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.brand_quaternary)), length, spannableStringBuilder.length(), 33);
            if (i != list.size() - 1) {
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " | ");
                ey0[] ey0VarArr = ey0.a;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(str.equals("Video") ? R.color.brand_tertiary : R.color.text_type1_primary)), length2, spannableStringBuilder.length(), 33);
            }
            i = i2;
        }
        return spannableStringBuilder;
    }

    public static final class a implements TabLayout.d {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function1<TabLayout.g, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function1<? super TabLayout.g, Unit> function1) {
            this.a = z;
            this.b = function1;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            View view;
            if (this.a) {
                return;
            }
            TextView textView = (gVar == null || (view = gVar.f) == null) ? null : (TextView) view.findViewById(R.id.tab_title);
            if (textView != null) {
                textView.setTypeface((gVar == null || !gVar.a()) ? Typeface.DEFAULT : Typeface.DEFAULT_BOLD);
            }
            this.b.invoke(gVar);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
            View view;
            TextView textView = (gVar == null || (view = gVar.f) == null) ? null : (TextView) view.findViewById(R.id.tab_title);
            if (textView != null) {
                textView.setTypeface((gVar == null || !gVar.a()) ? Typeface.DEFAULT : Typeface.DEFAULT_BOLD);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }
    }
}
