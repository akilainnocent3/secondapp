package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.IntroductionActivity;
import com.sportygames.sportysoccer.widget.HtmlTextLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class b0p extends RecyclerView.f {
    public final IntroductionActivity a;
    public final ArrayList b;
    public final LayoutInflater c;
    public final IntroductionActivity d;
    public int e = -1;

    public class a extends RecyclerView.d0 {
    }

    public class b extends RecyclerView.d0 implements View.OnClickListener {
        public final LinearLayout a;
        public final TextView b;
        public final ImageView c;

        public b(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.title_container);
            this.a = (LinearLayout) view.findViewById(R.id.content_details);
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (ImageView) view.findViewById(R.id.arrow);
            relativeLayout.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getId() == R.id.title_container) {
                b0p b0pVar = b0p.this;
                int i = b0pVar.e;
                int layoutPosition = getLayoutPosition();
                int i2 = b0pVar.e;
                if (i == layoutPosition) {
                    b0pVar.notifyItemChanged(i2);
                    b0pVar.e = -1;
                } else {
                    b0pVar.e = getLayoutPosition();
                    b0pVar.notifyItemChanged(i2);
                    b0pVar.notifyItemChanged(b0pVar.e);
                }
            }
        }
    }

    public b0p(IntroductionActivity introductionActivity, IntroductionActivity introductionActivity2, ArrayList arrayList) {
        this.a = introductionActivity;
        this.b = arrayList;
        this.d = introductionActivity2;
        this.c = LayoutInflater.from(introductionActivity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        HtmlTextLayout htmlTextLayout;
        HtmlTextLayout htmlTextLayout2;
        HtmlTextLayout htmlTextLayout3;
        HtmlTextLayout htmlTextLayout4;
        if (d0Var instanceof b) {
            b bVar = (b) d0Var;
            LinearLayout linearLayout = bVar.a;
            bVar.b.setText((String) this.b.get(i));
            int i2 = this.e;
            ImageView imageView = bVar.c;
            int i3 = 0;
            IntroductionActivity introductionActivity = this.a;
            if (i2 == i) {
                imageView.setImageDrawable(gr0.a(introductionActivity, R.drawable.sg_up_arrow));
                linearLayout.setVisibility(0);
                final IntroductionActivity introductionActivity2 = this.d;
                introductionActivity2.getClass();
                new Handler().postDelayed(new Runnable() { // from class: a0p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = IntroductionActivity.f;
                        introductionActivity2.e.o0(i);
                    }
                }, 200L);
            } else {
                imageView.setImageDrawable(gr0.a(introductionActivity, R.drawable.sg_down_arrow));
                linearLayout.setVisibility(8);
            }
            if (i == 1) {
                String[] stringArray = introductionActivity.getResources().getStringArray(R.array.real_money_mode_definition);
                linearLayout.removeAllViews();
                while (i3 < stringArray.length) {
                    HtmlTextLayout htmlTextLayout5 = (HtmlTextLayout) ((LayoutInflater) introductionActivity.getSystemService("layout_inflater")).inflate(R.layout.sg_ss_layout_html_text, (ViewGroup) null);
                    int i4 = i3 + 1;
                    htmlTextLayout5.a(1, -1, String.valueOf(i4), stringArray[i3]);
                    linearLayout.addView(htmlTextLayout5);
                    i3 = i4;
                }
                return;
            }
            if (i == 2) {
                String[] stringArray2 = introductionActivity.getResources().getStringArray(R.array.getting_started);
                linearLayout.removeAllViews();
                while (i3 < stringArray2.length) {
                    View viewInflate = ((LayoutInflater) introductionActivity.getSystemService("layout_inflater")).inflate(R.layout.sg_ss_layout_html_text, (ViewGroup) null);
                    if (i3 == 0) {
                        htmlTextLayout4 = (HtmlTextLayout) viewInflate;
                        htmlTextLayout4.a(1, R.drawable.sg_warning, "", stringArray2[i3]);
                    } else {
                        htmlTextLayout4 = (HtmlTextLayout) viewInflate;
                        htmlTextLayout4.a(2, -1, String.valueOf(i3), stringArray2[i3]);
                    }
                    linearLayout.addView(htmlTextLayout4);
                    i3++;
                }
                return;
            }
            if (i == 3) {
                String[] stringArray3 = introductionActivity.getResources().getStringArray(R.array.practice_mode);
                linearLayout.removeAllViews();
                while (i3 < stringArray3.length) {
                    HtmlTextLayout htmlTextLayout6 = (HtmlTextLayout) ((LayoutInflater) introductionActivity.getSystemService("layout_inflater")).inflate(R.layout.sg_ss_layout_html_text, (ViewGroup) null);
                    htmlTextLayout6.a(1, -1, "", stringArray3[i3]);
                    linearLayout.addView(htmlTextLayout6);
                    i3++;
                }
                return;
            }
            if (i == 4) {
                String[] stringArray4 = introductionActivity.getResources().getStringArray(R.array.real_money_mode);
                String[] stringArray5 = introductionActivity.getResources().getStringArray(R.array.real_money_mode_index);
                linearLayout.removeAllViews();
                while (i3 < stringArray4.length) {
                    View viewInflate2 = ((LayoutInflater) introductionActivity.getSystemService("layout_inflater")).inflate(R.layout.sg_ss_layout_html_text, (ViewGroup) null);
                    String str = i3 >= stringArray5.length ? "" : stringArray5[i3];
                    if (str.equals("3.1") || str.equals("3.2")) {
                        htmlTextLayout3 = (HtmlTextLayout) viewInflate2;
                        htmlTextLayout3.a(2, -1, str, stringArray4[i3]);
                    } else if (str.equals("3.1.1") || str.equals("3.1.2")) {
                        htmlTextLayout3 = (HtmlTextLayout) viewInflate2;
                        htmlTextLayout3.a(3, -1, str, stringArray4[i3]);
                    } else {
                        htmlTextLayout3 = (HtmlTextLayout) viewInflate2;
                        htmlTextLayout3.a(1, -1, str, stringArray4[i3]);
                    }
                    linearLayout.addView(htmlTextLayout3);
                    i3++;
                }
                return;
            }
            if (i == 5) {
                String[] stringArray6 = introductionActivity.getResources().getStringArray(R.array.important_notes);
                linearLayout.removeAllViews();
                while (i3 < stringArray6.length) {
                    View viewInflate3 = ((LayoutInflater) introductionActivity.getSystemService("layout_inflater")).inflate(R.layout.sg_ss_layout_html_text, (ViewGroup) null);
                    if (i3 == 0) {
                        htmlTextLayout2 = (HtmlTextLayout) viewInflate3;
                        htmlTextLayout2.a(1, -1, String.valueOf(i3 + 1), stringArray6[i3]);
                    } else {
                        htmlTextLayout2 = (HtmlTextLayout) viewInflate3;
                        htmlTextLayout2.a(1, -1, String.valueOf(i3 + 1), stringArray6[i3]);
                    }
                    linearLayout.addView(htmlTextLayout2);
                    i3++;
                }
                return;
            }
            if (i == 6) {
                String[] stringArray7 = introductionActivity.getResources().getStringArray(R.array.terms_and_condition);
                String[] stringArray8 = introductionActivity.getResources().getStringArray(R.array.terms_and_condition_index);
                linearLayout.removeAllViews();
                while (i3 < stringArray7.length) {
                    View viewInflate4 = ((LayoutInflater) introductionActivity.getSystemService("layout_inflater")).inflate(R.layout.sg_ss_layout_html_text, (ViewGroup) null);
                    if (stringArray8[i3].equals("1.1") || stringArray8[i3].equals("1.2") || stringArray8[i3].equals("1.3")) {
                        htmlTextLayout = (HtmlTextLayout) viewInflate4;
                        htmlTextLayout.a(2, -1, stringArray8[i3], stringArray7[i3]);
                    } else {
                        htmlTextLayout = (HtmlTextLayout) viewInflate4;
                        htmlTextLayout.a(1, -1, stringArray8[i3], stringArray7[i3]);
                    }
                    linearLayout.addView(htmlTextLayout);
                    i3++;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.c;
        if (i != 1) {
            return new b(layoutInflater.inflate(R.layout.sg_ss_list_item_introduction, viewGroup, false));
        }
        View viewInflate = layoutInflater.inflate(R.layout.sg_ss_list_header_introduction, viewGroup, false);
        a aVar = new a(viewInflate);
        return aVar;
    }
}
