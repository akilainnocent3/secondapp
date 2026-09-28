package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sportybet.android.auth.AccountHelperEntryPoint;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.e;
import com.sportybet.plugin.realsports.data.PickMarketMetadata;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.RTicket;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zy80 implements AccountHelperEntryPoint {
    public final /* synthetic */ AccountHelperEntryPointImpl a;
    public final nzm b;
    public final lhd0 c;

    public static final class a {
    }

    public zy80(Context context, nzm nzmVar) {
        context.getClass();
        nzmVar.getClass();
        this.a = new AccountHelperEntryPointImpl();
        this.b = nzmVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_comment_bet_share, (ViewGroup) null, false);
        int i = R.id.bet_type;
        TextView textView = (TextView) h5e.a(R.id.bet_type, viewInflate);
        if (textView != null) {
            i = R.id.betslip;
            TextView textView2 = (TextView) h5e.a(R.id.betslip, viewInflate);
            if (textView2 != null) {
                i = R.id.bg;
                View viewA = h5e.a(R.id.bg, viewInflate);
                if (viewA != null) {
                    i = R.id.bonus_percent_container;
                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.bonus_percent_container, viewInflate);
                    if (linearLayout != null) {
                        i = R.id.bonus_percent_value;
                        TextView textView3 = (TextView) h5e.a(R.id.bonus_percent_value, viewInflate);
                        if (textView3 != null) {
                            i = R.id.booking_code_title;
                            TextView textView4 = (TextView) h5e.a(R.id.booking_code_title, viewInflate);
                            if (textView4 != null) {
                                i = R.id.bottom_line;
                                View viewA2 = h5e.a(R.id.bottom_line, viewInflate);
                                if (viewA2 != null) {
                                    i = R.id.bottom_padding;
                                    View viewA3 = h5e.a(R.id.bottom_padding, viewInflate);
                                    if (viewA3 != null) {
                                        i = R.id.date;
                                        TextView textView5 = (TextView) h5e.a(R.id.date, viewInflate);
                                        if (textView5 != null) {
                                            i = R.id.declare;
                                            TextView textView6 = (TextView) h5e.a(R.id.declare, viewInflate);
                                            if (textView6 != null) {
                                                i = R.id.item_bottom_container;
                                                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.item_bottom_container, viewInflate);
                                                if (linearLayout2 != null) {
                                                    i = R.id.item_container;
                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.item_container, viewInflate);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.logo;
                                                        if (((ImageView) h5e.a(R.id.logo, viewInflate)) != null) {
                                                            i = R.id.logo_left_container;
                                                            LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.logo_left_container, viewInflate);
                                                            if (linearLayout4 != null) {
                                                                i = R.id.logo_right_container;
                                                                LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.logo_right_container, viewInflate);
                                                                if (linearLayout5 != null) {
                                                                    i = R.id.order_type_container;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.order_type_container, viewInflate);
                                                                    if (relativeLayout != null) {
                                                                        i = R.id.phone_number;
                                                                        TextView textView7 = (TextView) h5e.a(R.id.phone_number, viewInflate);
                                                                        if (textView7 != null) {
                                                                            i = R.id.return_info_container;
                                                                            LinearLayout linearLayout6 = (LinearLayout) h5e.a(R.id.return_info_container, viewInflate);
                                                                            if (linearLayout6 != null) {
                                                                                i = R.id.share_icon;
                                                                                CircleImageView circleImageView = (CircleImageView) h5e.a(R.id.share_icon, viewInflate);
                                                                                if (circleImageView != null) {
                                                                                    i = R.id.share_ticket_header_bg;
                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.share_ticket_header_bg, viewInflate);
                                                                                    if (appCompatImageView != null) {
                                                                                        i = R.id.share_total_stake;
                                                                                        TextView textView8 = (TextView) h5e.a(R.id.share_total_stake, viewInflate);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.sharecodevalue;
                                                                                            TextView textView9 = (TextView) h5e.a(R.id.sharecodevalue, viewInflate);
                                                                                            if (textView9 != null) {
                                                                                                i = R.id.top_padding;
                                                                                                View viewA4 = h5e.a(R.id.top_padding, viewInflate);
                                                                                                if (viewA4 != null) {
                                                                                                    i = R.id.total_bonus_container;
                                                                                                    LinearLayout linearLayout7 = (LinearLayout) h5e.a(R.id.total_bonus_container, viewInflate);
                                                                                                    if (linearLayout7 != null) {
                                                                                                        i = R.id.total_bonus_value;
                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.total_bonus_value, viewInflate);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.total_odds;
                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.total_odds, viewInflate);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.total_odds_container;
                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.total_odds_container, viewInflate);
                                                                                                                if (relativeLayout2 != null) {
                                                                                                                    i = R.id.total_odds_value;
                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.total_odds_value, viewInflate);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i = R.id.total_payout_container;
                                                                                                                        if (((LinearLayout) h5e.a(R.id.total_payout_container, viewInflate)) != null) {
                                                                                                                            i = R.id.total_payout_value;
                                                                                                                            TextView textView13 = (TextView) h5e.a(R.id.total_payout_value, viewInflate);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i = R.id.total_stake_container;
                                                                                                                                if (((LinearLayout) h5e.a(R.id.total_stake_container, viewInflate)) != null) {
                                                                                                                                    i = R.id.total_stake_value;
                                                                                                                                    TextView textView14 = (TextView) h5e.a(R.id.total_stake_value, viewInflate);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i = R.id.verify_code;
                                                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.verify_code, viewInflate);
                                                                                                                                        if (appCompatTextView != null) {
                                                                                                                                            i = R.id.verify_code_container;
                                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) h5e.a(R.id.verify_code_container, viewInflate);
                                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                                i = R.id.verify_code_title;
                                                                                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.verify_code_title, viewInflate);
                                                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                                                    this.c = new lhd0((ConstraintLayout) viewInflate, textView, textView2, viewA, linearLayout, textView3, textView4, viewA2, viewA3, textView5, textView6, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, textView7, linearLayout6, circleImageView, appCompatImageView, textView8, textView9, viewA4, linearLayout7, textView10, textView11, relativeLayout2, textView12, textView13, textView14, appCompatTextView, linearLayout8, appCompatTextView2);
                                                                                                                                                    return;
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static void h(TextView textView, String str, String str2) {
        int color = textView.getContext().getColor(R.color.brand_quinary);
        j7g j7gVar = new j7g();
        j7gVar.j(str, color, zch0.a(textView.getContext(), 20));
        j7gVar.j(bjb0.P(str2, Locale.US), color, zch0.a(textView.getContext(), 32));
        textView.setText(j7gVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(x1b x1bVar) {
        az80 az80Var;
        Object bVar;
        u7n u7nVarT;
        String lastNickName;
        lhd0 lhd0Var = this.c;
        CircleImageView circleImageView = lhd0Var.H;
        if (x1bVar instanceof az80) {
            az80Var = (az80) x1bVar;
            int i = az80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                az80Var.c = i - Integer.MIN_VALUE;
            } else {
                az80Var = new az80(this, x1bVar);
            }
        } else {
            az80Var = new az80(this, x1bVar);
        }
        Object objB = az80Var.a;
        y5b y5bVar = y5b.a;
        int i2 = az80Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = this.a;
                Account account = accountHelperEntryPointImpl.getAccountHelper().getAccount();
                if (account != null) {
                    lastNickName = accountHelperEntryPointImpl.getAccountHelper().getLastNickName();
                    if (TextUtils.isEmpty(lastNickName)) {
                        lastNickName = account.name;
                    }
                    if (lastNickName != null && TextUtils.isDigitsOnly(lastNickName) && lastNickName.length() > 5) {
                        lastNickName = fu5.a("(?<=\\d{2})\\d(?=\\d{3})", lastNickName, "*");
                    }
                } else {
                    lastNickName = null;
                }
                boolean zIsEmpty = TextUtils.isEmpty(lastNickName);
                TextView textView = lhd0Var.F;
                if (zIsEmpty) {
                    textView.setText("");
                } else {
                    textView.setText(lastNickName);
                }
                zi50.a aVar = zi50.b;
                nan.a aVar2 = new nan.a(e());
                aVar2.c = accountHelperEntryPointImpl.getAccountHelper().getAvatarUrl();
                aVar2.l = wr5.c;
                aVar2.e(bqe.a(36.0f));
                abn.a(aVar2, false);
                nan nanVarA = aVar2.a();
                m9n m9nVarA = qw90.a(e());
                az80Var.c = 1;
                objB = m9nVarA.b(nanVarA, az80Var);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objB);
            }
            bVar = (dbn) objB;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        dbn dbnVar = (dbn) (bVar instanceof zi50.b ? null : bVar);
        if (dbnVar == null || (u7nVarT = dbnVar.t()) == null) {
            circleImageView.setImageResource(R.drawable.default_avatar);
        } else {
            Resources resources = e().getResources();
            resources.getClass();
            circleImageView.setImageDrawable(zbn.a(u7nVarT, resources));
        }
        return Unit.a;
    }

    public final String b(String str, boolean z) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = d(z);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Bitmap bitmap = (Bitmap) bVar;
        if (bitmap == null) {
            return null;
        }
        String absolutePath = e().getFilesDir().getAbsolutePath();
        String str2 = File.separator;
        File file = new File(v70.b(absolutePath, str2, "sportybetImage", str2));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str == null ? "betshare.jpg" : tug.a("betshare_", str, ".jpg"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, zch0.c(bitmap), fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mkh.c(e(), yrh0.h(e()), file2).toString();
    }

    public final void c() {
        String absolutePath = e().getFilesDir().getAbsolutePath();
        String str = File.separator;
        File file = new File(v70.b(absolutePath, str, "sportybetImage", str));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "betshare.jpg");
        if (file2.exists() && file2.isFile()) {
            file2.delete();
        }
    }

    public final Bitmap d(boolean z) {
        int height;
        int i;
        lhd0 lhd0Var = this.c;
        ConstraintLayout constraintLayout = lhd0Var.a;
        LinearLayout linearLayout = lhd0Var.C;
        g();
        if (z && (height = linearLayout.getHeight()) > 0) {
            int iA = bqe.a(38.0f);
            int iA2 = bqe.a(466.0f);
            Drawable drawable = e().getDrawable(R.drawable.img__brand_logo);
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : bqe.a(24.0f);
            int i2 = iA + intrinsicHeight;
            int i3 = 0;
            if (i2 <= height) {
                i = 1;
                while (i2 + iA2 + intrinsicHeight <= height) {
                    i++;
                    i2 += iA2 + intrinsicHeight;
                }
            } else {
                i = 0;
            }
            int i4 = i >= 1 ? i : 1;
            int iA3 = bqe.a(38.0f);
            int iA4 = bqe.a(306.0f);
            int iA5 = bqe.a(466.0f);
            LinearLayout linearLayout2 = lhd0Var.D;
            linearLayout.removeAllViews();
            linearLayout2.removeAllViews();
            while (i3 < i4) {
                ImageView imageView = new ImageView(e());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = i3 == 0 ? iA3 : iA5;
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(R.drawable.img__brand_logo);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                imageView.setScaleType(scaleType);
                linearLayout.addView(imageView);
                ImageView imageView2 = new ImageView(e());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = i3 == 0 ? iA4 : iA5;
                imageView2.setLayoutParams(layoutParams2);
                imageView2.setImageResource(R.drawable.img__brand_logo);
                imageView2.setScaleType(scaleType);
                linearLayout2.addView(imageView2);
                i3++;
            }
            g();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(constraintLayout.getMeasuredWidth(), constraintLayout.getMeasuredHeight(), Bitmap.Config.RGB_565);
        constraintLayout.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final Context e() {
        Context context = this.c.a.getContext();
        context.getClass();
        return context;
    }

    public final File f() {
        String absolutePath = e().getFilesDir().getAbsolutePath();
        String str = File.separator;
        File file = new File(v70.b(absolutePath, str, "sportybetImage", str));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "betshare.jpg");
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final void g() {
        ConstraintLayout constraintLayout = this.c.a;
        constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(e().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        constraintLayout.layout(0, 0, constraintLayout.getMeasuredWidth(), constraintLayout.getMeasuredHeight());
    }

    @Override // com.sportybet.android.auth.AccountHelperEntryPoint
    public final uqm getAccountHelper() {
        return this.a.getAccountHelper();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0369  */
    /* JADX WARN: Code duplicated, block: B:123:0x0434  */
    /* JADX WARN: Code duplicated, block: B:125:0x043d  */
    /* JADX WARN: Code duplicated, block: B:126:0x043f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0448  */
    /* JADX WARN: Code duplicated, block: B:132:0x044c  */
    /* JADX WARN: Code duplicated, block: B:133:0x044e  */
    /* JADX WARN: Code duplicated, block: B:136:0x046c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0493  */
    /* JADX WARN: Code duplicated, block: B:142:0x0576  */
    /* JADX WARN: Code duplicated, block: B:145:0x0591  */
    /* JADX WARN: Code duplicated, block: B:147:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:148:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:150:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x05db  */
    /* JADX WARN: Code duplicated, block: B:160:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:161:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:192:0x063f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0657  */
    /* JADX WARN: Code duplicated, block: B:204:0x0659  */
    /* JADX WARN: Code duplicated, block: B:207:0x066c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0670  */
    /* JADX WARN: Code duplicated, block: B:210:0x0675  */
    /* JADX WARN: Code duplicated, block: B:220:0x068d  */
    /* JADX WARN: Code duplicated, block: B:222:0x069a  */
    /* JADX WARN: Code duplicated, block: B:228:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:229:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:247:0x0732  */
    /* JADX WARN: Code duplicated, block: B:250:0x0746  */
    /* JADX WARN: Code duplicated, block: B:252:0x0754  */
    /* JADX WARN: Code duplicated, block: B:253:0x076b  */
    /* JADX WARN: Code duplicated, block: B:256:0x0788 A[LOOP:2: B:254:0x0782->B:256:0x0788, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:261:0x07be  */
    /* JADX WARN: Code duplicated, block: B:263:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:265:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:266:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:269:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:271:0x081b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0827  */
    /* JADX WARN: Code duplicated, block: B:276:0x0836  */
    /* JADX WARN: Code duplicated, block: B:278:0x0879  */
    /* JADX WARN: Code duplicated, block: B:279:0x087b  */
    /* JADX WARN: Code duplicated, block: B:288:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:291:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:293:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:294:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:304:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(RTicket rTicket, x1b x1bVar) {
        bz80 bz80Var;
        BigDecimal bigDecimal;
        Object bVar;
        BigDecimal bigDecimal2;
        Object bVar2;
        BigDecimal bigDecimal3;
        BigDecimal scale;
        BigDecimal bigDecimalMin;
        BigDecimal bigDecimal4;
        Object bVar3;
        RTicket rTicket2;
        String strB;
        TextView textView;
        boolean z;
        String strB2;
        String strB3;
        String strA;
        bwf0 bwf0Var;
        boolean zIsAllSelectionSettled;
        List<RSelection> list;
        j7g j7gVar;
        int size;
        int i;
        RSelection rSelection;
        TextView textView2;
        int i2;
        mfb0 mfb0VarE;
        Drawable drawableMutate;
        PickMarketMetadata pickMarketMetadata;
        String marketHeadline;
        Drawable drawableD;
        String str;
        boolean z2;
        int i3;
        Iterator it;
        RSelection rSelection2;
        View viewInflate;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        LinearLayout linearLayout;
        String str2;
        StringBuilder sb;
        View view;
        String strD;
        int i4;
        int i5;
        int i6;
        int i7;
        Drawable drawableA;
        j7g j7gVar2;
        int i8;
        mfb0 mfb0VarE2;
        ArrayList arrayList;
        j7g j7gVar3;
        int i9;
        int size2;
        int i10;
        boolean z3;
        PickMarketMetadata pickMarketMetadata2;
        String marketHeadline2;
        int i11;
        mfb0 mfb0VarE3;
        String strF;
        Object bVar4;
        RTicket rTicket3 = rTicket;
        if (x1bVar instanceof bz80) {
            bz80Var = (bz80) x1bVar;
            int i12 = bz80Var.w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bz80Var.w = i12 - Integer.MIN_VALUE;
            } else {
                bz80Var = new bz80(this, x1bVar);
            }
        } else {
            bz80Var = new bz80(this, x1bVar);
        }
        Object obj = bz80Var.i;
        Object obj2 = y5b.a;
        int i13 = bz80Var.w;
        if (i13 == 0) {
            uj50.b(obj);
            bigDecimal = new BigDecimal("100");
            BigDecimal bigDecimalE = this.b.e();
            try {
                zi50.a aVar = zi50.b;
                BigDecimal bigDecimalMultiply = new BigDecimal(rTicket3.totalBonus).divide(new BigDecimal(rTicket3.totalStake), 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100"));
                DecimalFormat decimalFormat = b6y.a;
                String str3 = b6y.a.format(bigDecimalMultiply.doubleValue());
                str3.getClass();
                bVar = new BigDecimal(str3);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj3 = BigDecimal.ZERO;
            if (bVar instanceof zi50.b) {
                bVar = obj3;
            }
            bigDecimal2 = (BigDecimal) bVar;
            try {
                String str4 = b6y.a.format(((bjb0.d0(rTicket3.totalBonus) / bjb0.d0(rTicket3.totalStake)) / bjb0.d0(rTicket3.totalOdds)) * 100.0d);
                str4.getClass();
                bVar2 = new BigDecimal(str4);
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            bigDecimal3 = BigDecimal.ZERO;
            if (bVar2 instanceof zi50.b) {
                bVar2 = bigDecimal3;
            }
            BigDecimal bigDecimal5 = (BigDecimal) bVar2;
            if (bigDecimal5.compareTo(bigDecimal3) < 0) {
                bigDecimal3.getClass();
            } else {
                bigDecimal3 = bigDecimal5;
            }
            String str5 = rTicket3.totalOdds;
            if (str5 == null || str5.length() == 0) {
                List<RSelection> list2 = rTicket3.selections;
                list2.getClass();
                HashMap map = new HashMap();
                BigDecimal bigDecimalMultiply2 = BigDecimal.ONE;
                for (RSelection rSelection3 : list2) {
                    Object obj4 = map.get(rSelection3.eventId);
                    String str6 = rSelection3.eventId;
                    if (obj4 == null) {
                        map.put(str6, rSelection3.odds);
                    } else if (new BigDecimal(rSelection3.odds).compareTo(new BigDecimal((String) map.get(str6))) > 0) {
                        map.put(rSelection3.eventId, rSelection3.odds);
                    }
                }
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    bigDecimalMultiply2 = bigDecimalMultiply2.multiply(new BigDecimal((String) it2.next()));
                }
                scale = bigDecimalMultiply2.setScale(2, RoundingMode.HALF_UP);
                scale.getClass();
            } else {
                try {
                    bVar3 = new BigDecimal(rTicket3.totalOdds);
                } catch (Throwable th3) {
                    zi50.a aVar4 = zi50.b;
                    bVar3 = new zi50.b(th3);
                }
                Object obj5 = BigDecimal.ONE;
                if (bVar3 instanceof zi50.b) {
                    bVar3 = obj5;
                }
                scale = (BigDecimal) bVar3;
            }
            BigDecimal bigDecimalMin2 = bigDecimal.multiply(scale).min(bigDecimalE);
            bigDecimalMin2.getClass();
            if (Intrinsics.g(BigDecimal.ZERO, bigDecimal2)) {
                bigDecimalMin = bigDecimalMin2;
            } else {
                bigDecimalMin = bigDecimalMin2.add(bigDecimal2).min(bigDecimalE);
                bigDecimalMin.getClass();
            }
            bz80Var.a = rTicket3;
            bz80Var.b = bigDecimal;
            bz80Var.c = bigDecimal2;
            bz80Var.d = bigDecimal3;
            bz80Var.e = scale;
            bz80Var.f = bigDecimalMin;
            bz80Var.w = 1;
            if (a(bz80Var) == obj2) {
                return obj2;
            }
            bigDecimal4 = scale;
        } else {
            if (i13 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            BigDecimal bigDecimal6 = bz80Var.f;
            bigDecimal4 = bz80Var.e;
            BigDecimal bigDecimal7 = bz80Var.d;
            bigDecimal2 = bz80Var.c;
            bigDecimal = bz80Var.b;
            RTicket rTicket4 = bz80Var.a;
            uj50.b(obj);
            bigDecimal3 = bigDecimal7;
            bigDecimalMin = bigDecimal6;
            rTicket3 = rTicket4;
        }
        lhd0 lhd0Var = this.c;
        LinearLayout linearLayout2 = lhd0Var.B;
        TextView textView8 = lhd0Var.i;
        TextView textView9 = lhd0Var.c;
        View view2 = lhd0Var.v;
        RelativeLayout relativeLayout = lhd0Var.E;
        TextView textView10 = lhd0Var.J;
        LinearLayout linearLayout3 = lhd0Var.G;
        RelativeLayout relativeLayout2 = lhd0Var.P;
        LinearLayout linearLayout4 = lhd0Var.M;
        BigDecimal bigDecimal8 = bigDecimal4;
        LinearLayout linearLayout5 = lhd0Var.e;
        TextView textView11 = lhd0Var.O;
        TextView textView12 = lhd0Var.z;
        TextView textView13 = lhd0Var.K;
        linearLayout2.removeAllViews();
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        RTicket rTicket5 = rTicket3;
        lhd0Var.S.setText(bigDecimal + ".00");
        TextView textView14 = lhd0Var.R;
        Locale locale = Locale.US;
        textView14.setText(bjb0.L(bigDecimalMin, locale));
        int i14 = 8;
        if (bigDecimal2.compareTo(BigDecimal.ZERO) > 0) {
            lhd0Var.f.setText(bigDecimal3 + "%");
            linearLayout5.setVisibility(0);
            lhd0Var.N.setText(bjb0.L(bigDecimal2, locale));
            linearLayout4.setVisibility(0);
        } else {
            linearLayout5.setVisibility(8);
            linearLayout4.setVisibility(8);
        }
        if (rTicket5.isAllSelectionSettled()) {
            layoutParams2.j = R.id.order_type_container;
            relativeLayout2.setVisibility(8);
            linearLayout3.setVisibility(8);
            textView10.setVisibility(8);
            relativeLayout.setVisibility(0);
            view2.setVisibility(0);
            textView9.setText(sn5.b(e(), R.string.common_functions__betslip, new Object[0]));
            textView8.setVisibility(8);
            try {
                zi50.a aVar5 = zi50.b;
                rTicket2 = rTicket5;
                try {
                    String str7 = rTicket2.totalWinnings;
                    str7.getClass();
                    bVar4 = Double.valueOf(Double.parseDouble(str7));
                } catch (Throwable th4) {
                    th = th4;
                    zi50.a aVar6 = zi50.b;
                    bVar4 = new zi50.b(th);
                }
            } catch (Throwable th5) {
                th = th5;
                rTicket2 = rTicket5;
            }
            Object objValueOf = Double.valueOf(0.0d);
            if (bVar4 instanceof zi50.b) {
                bVar4 = objValueOf;
            }
            if (((Number) bVar4).doubleValue() == 0.0d) {
                textView13.setVisibility(8);
                textView12.setText(sn5.b(e(), R.string.component_betslip__better_luck_next_time, new Object[0]));
            } else {
                textView12.setText(sn5.b(e(), R.string.component_betslip__i_won, new Object[0]));
                textView13.setVisibility(0);
                textView13.setPaintFlags(0);
                h(textView13, a8b.d(), rTicket2.totalWinnings);
            }
        } else {
            rTicket2 = rTicket5;
            layoutParams2.j = R.id.return_info_container;
            int iA = bqe.a(20.0f);
            layoutParams2.setMargins(iA, 0, iA, bqe.a(17.0f));
            relativeLayout2.setVisibility(0);
            linearLayout3.setVisibility(0);
            relativeLayout.setVisibility(8);
            view2.setVisibility(8);
            textView12.setText(sn5.b(e(), R.string.component_betslip__simply_following_my_betslip_by_inputting_this_code, new Object[0]));
            textView9.setText(sn5.b(e(), R.string.common_functions__betslip, new Object[0]));
            textView8.setVisibility(0);
            textView13.setVisibility(0);
            textView13.setText(rTicket2.shareCode);
            textView13.setPaintFlags(textView13.getPaintFlags() | 8);
        }
        if (rTicket2.winningStatus == 20) {
            h(textView10, a8b.d(), rTicket2.totalWinnings);
        } else {
            textView10.setVisibility(8);
        }
        TextView textView15 = lhd0Var.b;
        Context contextE = e();
        int i15 = rTicket2.orderType;
        int i16 = rTicket2.combinationSize;
        String str8 = "";
        if (i15 == 1) {
            strB = sn5.b(contextE, R.string.component_betslip__singles, new Object[0]);
        } else if (i15 != 2) {
            strB = i15 != 3 ? i15 != 4 ? "" : sn5.b(contextE, R.string.bet_history__multiple, new Object[0]) : sn5.b(contextE, R.string.common_functions__system, new Object[0]);
        }
        if (i16 > 1) {
            strB = strB + "(x" + i16 + ")";
        }
        textView15.setText(strB);
        if (TextUtils.isEmpty(rTicket2.finalTotalOdds)) {
            textView = textView11;
            z = false;
            if (TextUtils.isEmpty(rTicket2.totalOdds)) {
                textView.setVisibility(8);
            } else {
                strB2 = sn5.b(e(), R.string.common_functions__total_odds, new Object[0]);
                strB3 = sn5.b(e(), R.string.app_common__blank_space, new Object[0]);
                String str9 = rTicket2.totalOdds;
                str9.getClass();
                strA = gky.a.a(str9, false);
            }
            String string = bigDecimal8.toString();
            string.getClass();
            lhd0Var.Q.setText(gky.a.a(string, z));
            TextView textView16 = lhd0Var.y;
            long j = rTicket2.createTime;
            bwf0Var = bwf0.a;
            textView16.setText(bwf0Var.g(j));
            linearLayout2.setLayoutParams(layoutParams2);
            zIsAllSelectionSettled = rTicket2.isAllSelectionSettled();
            list = rTicket2.selections;
            if (zIsAllSelectionSettled) {
                list.getClass();
                str = rTicket2.verifyCode;
                if (rTicket2.winningStatus == 20) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!list.isEmpty()) {
                    AppCompatImageView appCompatImageView = lhd0Var.I;
                    if (z2) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    appCompatImageView.setVisibility(i3);
                    lhd0Var.C.setVisibility(0);
                    lhd0Var.D.setVisibility(0);
                    lhd0Var.U.setVisibility(0);
                    lhd0Var.A.setVisibility(0);
                    linearLayout2.removeAllViews();
                    if (str != null) {
                        lhd0Var.V.setText(sn5.b(e(), R.string.bet_history__verify_code, new Object[0]).concat(": "));
                        lhd0Var.T.setText(str);
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                        rSelection2 = (RSelection) it.next();
                        viewInflate = LayoutInflater.from(e()).inflate(R.layout.spr_ticket_detail_item, (ViewGroup) null);
                        viewInflate.getClass();
                        rSelection2.getClass();
                        View viewFindViewById = viewInflate.findViewById(R.id.td_live);
                        viewFindViewById.getClass();
                        textView3 = (TextView) viewFindViewById;
                        View viewFindViewById2 = viewInflate.findViewById(R.id.td_game_id_date);
                        viewFindViewById2.getClass();
                        textView4 = (TextView) viewFindViewById2;
                        View viewFindViewById3 = viewInflate.findViewById(R.id.td_status_icon);
                        viewFindViewById3.getClass();
                        ImageView imageView = (ImageView) viewFindViewById3;
                        View viewFindViewById4 = viewInflate.findViewById(R.id.td_match_name);
                        viewFindViewById4.getClass();
                        textView5 = (TextView) viewFindViewById4;
                        View viewFindViewById5 = viewInflate.findViewById(R.id.td_game_score);
                        viewFindViewById5.getClass();
                        textView6 = (TextView) viewFindViewById5;
                        View viewFindViewById6 = viewInflate.findViewById(R.id.game_label);
                        viewFindViewById6.getClass();
                        textView7 = (TextView) viewFindViewById6;
                        View viewFindViewById7 = viewInflate.findViewById(R.id.td_selection_container);
                        viewFindViewById7.getClass();
                        linearLayout = (LinearLayout) viewFindViewById7;
                        View viewFindViewById8 = viewInflate.findViewById(R.id.delayed_settle_icon);
                        viewFindViewById8.getClass();
                        ImageView imageView2 = (ImageView) viewFindViewById8;
                        viewInflate.findViewById(R.id.td_live_betting).setVisibility(i14);
                        viewInflate.findViewById(R.id.match_tracker).setVisibility(i14);
                        viewInflate.findViewById(R.id.td_game_score_tracker_limiter).setVisibility(i14);
                        viewInflate.findViewById(R.id.comments).setVisibility(i14);
                        str2 = str8;
                        viewInflate.findViewById(R.id.td_bottom_line).setVisibility(0);
                        textView3.setVisibility(i14);
                        imageView.setImageDrawable(null);
                        imageView.setTag(null);
                        textView6.setVisibility(i14);
                        textView7.setVisibility(i14);
                        textView7.setTypeface(textView7.getTypeface(), 0);
                        textView7.setTextColor(textView7.getContext().getColor(R.color.text_type2_tertiary));
                        sb = new StringBuilder();
                        if (!TextUtils.isEmpty(rSelection2.gameId)) {
                            sb.append(sn5.c(textView4, R.string.bet_history__game_id_vid, rSelection2.gameId));
                            sb.append(" | ");
                        }
                        if (rSelection2.isOngoing()) {
                            textView3.setVisibility(0);
                            mfb0VarE3 = lfb0.d().e(rSelection2.sportId);
                            if (mfb0VarE3 == null) {
                                strF = str2;
                            } else {
                                strF = mfb0VarE3.f(rSelection2.playedSeconds, rSelection2.remainingTimeInPeriod, rSelection2.matchStatus);
                            }
                            strD = strF;
                            view = viewInflate;
                        } else {
                            it = it;
                            view = viewInflate;
                            strD = bwf0Var.d(rSelection2.startTime, false);
                        }
                        if (!TextUtils.isEmpty(strD)) {
                            sb.append(strD);
                        }
                        if (TextUtils.isEmpty(sb.toString())) {
                            i4 = 8;
                            textView4.setVisibility(8);
                        } else {
                            i4 = 8;
                            textView4.setVisibility(0);
                            textView4.setText(sb.toString());
                        }
                        if (q980.c(rSelection2)) {
                            i5 = 0;
                        } else {
                            i5 = i4;
                        }
                        imageView2.setVisibility(i5);
                        i6 = rSelection2.eventStatus;
                        if ((i6 == 0 && i6 != 6) || rSelection2.status != 0) {
                            if (rSelection2.isOngoing() || (i11 = rSelection2.status) == 0) {
                                i7 = R.drawable.ic_selection_status_ongoing;
                            } else if (i11 == 1) {
                                int i17 = rSelection2.settleType;
                                if (i17 == 1) {
                                    i7 = R.drawable.ic_selection_status_flashwin;
                                } else if (i17 == 2) {
                                    i7 = R.drawable.ic_selection_status_flashsave;
                                } else if (i17 == 5) {
                                    i7 = R.drawable.ic_selection_status_1_up;
                                } else if (i17 == 3) {
                                    i7 = R.drawable.ic_selection_status_2_up;
                                } else if (i17 == 6) {
                                    i7 = R.drawable.ic_selection_status_over_under_early_goals;
                                } else if (i17 == 7) {
                                    i7 = R.drawable.ic_selection_status_1_up;
                                } else {
                                    i7 = R.drawable.ic_selection_status_win;
                                }
                            } else if (i11 != 2) {
                                i7 = (i11 == 3 || i11 == 4) ? R.drawable.ic_selection_status_void : -1;
                            } else {
                                i7 = R.drawable.ic_selection_status_lost;
                            }
                        }
                        if (i7 == -1) {
                            drawableA = null;
                        } else {
                            drawableA = gr0.a(view.getContext(), i7);
                        }
                        imageView.setImageDrawable(drawableA);
                        if (b3.U(rSelection2.eventId)) {
                            pickMarketMetadata2 = rSelection2.pickMarketMetadata;
                            if (pickMarketMetadata2 != null) {
                                marketHeadline2 = pickMarketMetadata2.getMarketHeadline();
                            } else {
                                marketHeadline2 = null;
                            }
                            if (marketHeadline2 != null || marketHeadline2.length() == 0) {
                                j7gVar2 = new j7g();
                                if (!TextUtils.isEmpty(rSelection2.home)) {
                                    j7gVar2 = new j7g(rSelection2.home);
                                    j7gVar2.e(Color.parseColor("#9ca0ab"), " v ");
                                    j7gVar2.a(rSelection2.away);
                                }
                                textView5.setText(j7gVar2);
                            } else {
                                PickMarketMetadata pickMarketMetadata3 = rSelection2.pickMarketMetadata;
                                textView5.setText(pickMarketMetadata3 != null ? pickMarketMetadata3.getMarketHeadline() : null);
                            }
                        } else {
                            j7gVar2 = new j7g();
                            if (!TextUtils.isEmpty(rSelection2.home) && !TextUtils.isEmpty(rSelection2.away)) {
                                j7gVar2 = new j7g(rSelection2.home);
                                j7gVar2.e(Color.parseColor("#9ca0ab"), " v ");
                                j7gVar2.a(rSelection2.away);
                            }
                            textView5.setText(j7gVar2);
                        }
                        if (!rSelection2.isVoid()) {
                            i8 = rSelection2.eventStatus;
                            if (i8 != 1 || i8 == 2) {
                                textView7.setVisibility(0);
                                textView7.setText(sn5.c(textView7, R.string.bet_history__live_score, new Object[0]));
                                mfb0VarE2 = lfb0.d().e(rSelection2.sportId);
                                arrayList = new ArrayList();
                                if (mfb0VarE2 != null) {
                                    arrayList.addAll(mfb0VarE2.A(rSelection2.setScore, null, null));
                                }
                                textView6.setVisibility(0);
                                if (arrayList.isEmpty()) {
                                    textView6.setText(sn5.c(textView6, R.string.app_common__na, new Object[0]));
                                } else {
                                    j7gVar3 = new j7g();
                                    if (arrayList.size() == 2) {
                                        j7gVar3.a((CharSequence) arrayList.get(0));
                                        j7gVar3.a(":");
                                        j7gVar3.a((CharSequence) arrayList.get(1));
                                    } else {
                                        j7gVar3.d((CharSequence) arrayList.get(0), true);
                                        j7gVar3.d(":", true);
                                        j7gVar3.d((CharSequence) arrayList.get(1), true);
                                        for (i9 = 2; i9 < arrayList.size(); i9 += 2) {
                                            j7gVar3.a("  ");
                                            j7gVar3.a((CharSequence) arrayList.get(i9));
                                            j7gVar3.a(":");
                                            j7gVar3.a((CharSequence) arrayList.get(i9 + 1));
                                        }
                                    }
                                    textView6.setText(j7gVar3);
                                }
                            } else if (i8 == 3 || i8 == 4) {
                                textView7.setVisibility(0);
                                textView7.setText("sr:sport:1".equals(rSelection2.sportId) ? R.string.bet_history__ft_score : R.string.bet_history__final_score);
                                textView6.setVisibility(0);
                                if (TextUtils.isEmpty(rSelection2.setScore)) {
                                    textView6.setText(sn5.c(textView6, R.string.app_common__na, new Object[0]));
                                } else {
                                    textView6.setVisibility(0);
                                    textView6.setText(rSelection2.setScore);
                                }
                            }
                            linearLayout.removeAllViews();
                            if (rSelection2.isBetBuilder()) {
                                g880.b(rSelection2, linearLayout);
                                size2 = rSelection2.betBuilderSelections.size();
                                i10 = 0;
                                while (i10 < size2) {
                                    if (i10 == rSelection2.betBuilderSelections.size() - 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    RSelection rSelection4 = rSelection2.betBuilderSelections.get(i10);
                                    rSelection4.getClass();
                                    RSelection rSelection5 = rSelection2;
                                    g880.c(rSelection4, linearLayout, null, rSelection5, z3, true);
                                    i10++;
                                    rSelection2 = rSelection5;
                                }
                            } else {
                                g880.c(rSelection2, linearLayout, null, null, false, true);
                            }
                            g880.a(rSelection2, linearLayout);
                            linearLayout2.addView(view);
                            i14 = i4;
                            str8 = str2;
                            it = it;
                        }
                        linearLayout.removeAllViews();
                        if (rSelection2.isBetBuilder()) {
                            g880.b(rSelection2, linearLayout);
                            size2 = rSelection2.betBuilderSelections.size();
                            i10 = 0;
                            while (i10 < size2) {
                                if (i10 == rSelection2.betBuilderSelections.size() - 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                RSelection rSelection6 = rSelection2.betBuilderSelections.get(i10);
                                rSelection6.getClass();
                                RSelection rSelection7 = rSelection2;
                                g880.c(rSelection6, linearLayout, null, rSelection7, z3, true);
                                i10++;
                                rSelection2 = rSelection7;
                            }
                        } else {
                            g880.c(rSelection2, linearLayout, null, null, false, true);
                        }
                        g880.a(rSelection2, linearLayout);
                        linearLayout2.addView(view);
                        i14 = i4;
                        str8 = str2;
                        it = it;
                    }
                }
            } else {
                list.getClass();
                if (!list.isEmpty()) {
                    linearLayout2.removeAllViews();
                    j7gVar = new j7g();
                    size = list.size();
                    for (i = 0; i < size; i++) {
                        rSelection = list.get(i);
                        View viewInflate2 = LayoutInflater.from(e()).inflate(R.layout.spr_bet_share_item, (ViewGroup) null);
                        TextView textView17 = (TextView) viewInflate2.findViewById(R.id.game);
                        TextView textView18 = (TextView) viewInflate2.findViewById(R.id.odds);
                        textView2 = (TextView) viewInflate2.findViewById(R.id.teamname);
                        TextView textView19 = (TextView) viewInflate2.findViewById(R.id.market);
                        View viewFindViewById9 = viewInflate2.findViewById(R.id.diver_line);
                        if (i == 0) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        viewFindViewById9.setVisibility(i2);
                        textView17.setText(rSelection.outcomeDesc);
                        mfb0VarE = lfb0.d().e(rSelection.sportId);
                        if (mfb0VarE != null || (drawableD = mfb0VarE.d()) == null || (drawableMutate = drawableD.mutate()) == null) {
                            drawableMutate = null;
                        } else {
                            drawableMutate.setTint(e().getColor(R.color.text_type1_primary));
                        }
                        textView17.setCompoundDrawablesWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView17.setCompoundDrawablePadding(zch0.b(e().getResources(), 10));
                        String str10 = rSelection.odds;
                        str10.getClass();
                        textView18.setText(gky.a.a(str10, false));
                        if (b3.U(rSelection.eventId)) {
                            pickMarketMetadata = rSelection.pickMarketMetadata;
                            if (pickMarketMetadata != null) {
                                marketHeadline = pickMarketMetadata.getMarketHeadline();
                            } else {
                                marketHeadline = null;
                            }
                            if (marketHeadline != null || marketHeadline.length() == 0) {
                                j7gVar.clear();
                                j7gVar.a(rSelection.home);
                                j7gVar.e(Color.parseColor("#8b8e9b"), " vs ");
                                j7gVar.a(rSelection.away);
                                textView2.setText(j7gVar);
                            } else {
                                PickMarketMetadata pickMarketMetadata4 = rSelection.pickMarketMetadata;
                                textView2.setText(pickMarketMetadata4 != null ? pickMarketMetadata4.getMarketHeadline() : null);
                            }
                        } else {
                            j7gVar.clear();
                            j7gVar.a(rSelection.home);
                            j7gVar.e(Color.parseColor("#8b8e9b"), " vs ");
                            j7gVar.a(rSelection.away);
                            textView2.setText(j7gVar);
                        }
                        textView19.setText(e.d(rSelection.marketId, rSelection.specifier, rSelection.marketDesc));
                        linearLayout2.addView(viewInflate2);
                    }
                }
            }
            return Unit.a;
        }
        z = false;
        strB2 = sn5.b(e(), R.string.common_functions__total_odds, new Object[0]);
        strB3 = sn5.b(e(), R.string.app_common__blank_space, new Object[0]);
        String str11 = rTicket2.finalTotalOdds;
        str11.getClass();
        strA = gky.a.a(str11, false);
        textView = textView11;
        hu1.b(strB2, strB3, strA, textView);
        String string2 = bigDecimal8.toString();
        string2.getClass();
        lhd0Var.Q.setText(gky.a.a(string2, z));
        TextView textView110 = lhd0Var.y;
        long j2 = rTicket2.createTime;
        bwf0Var = bwf0.a;
        textView110.setText(bwf0Var.g(j2));
        linearLayout2.setLayoutParams(layoutParams2);
        zIsAllSelectionSettled = rTicket2.isAllSelectionSettled();
        list = rTicket2.selections;
        if (zIsAllSelectionSettled) {
            list.getClass();
            str = rTicket2.verifyCode;
            if (rTicket2.winningStatus == 20) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!list.isEmpty()) {
                AppCompatImageView appCompatImageView2 = lhd0Var.I;
                if (z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                appCompatImageView2.setVisibility(i3);
                lhd0Var.C.setVisibility(0);
                lhd0Var.D.setVisibility(0);
                lhd0Var.U.setVisibility(0);
                lhd0Var.A.setVisibility(0);
                linearLayout2.removeAllViews();
                if (str != null) {
                    lhd0Var.V.setText(sn5.b(e(), R.string.bet_history__verify_code, new Object[0]).concat(": "));
                    lhd0Var.T.setText(str);
                }
                it = list.iterator();
                while (it.hasNext()) {
                    rSelection2 = (RSelection) it.next();
                    viewInflate = LayoutInflater.from(e()).inflate(R.layout.spr_ticket_detail_item, (ViewGroup) null);
                    viewInflate.getClass();
                    rSelection2.getClass();
                    View viewFindViewById10 = viewInflate.findViewById(R.id.td_live);
                    viewFindViewById10.getClass();
                    textView3 = (TextView) viewFindViewById10;
                    View viewFindViewById11 = viewInflate.findViewById(R.id.td_game_id_date);
                    viewFindViewById11.getClass();
                    textView4 = (TextView) viewFindViewById11;
                    View viewFindViewById12 = viewInflate.findViewById(R.id.td_status_icon);
                    viewFindViewById12.getClass();
                    ImageView imageView3 = (ImageView) viewFindViewById12;
                    View viewFindViewById13 = viewInflate.findViewById(R.id.td_match_name);
                    viewFindViewById13.getClass();
                    textView5 = (TextView) viewFindViewById13;
                    View viewFindViewById14 = viewInflate.findViewById(R.id.td_game_score);
                    viewFindViewById14.getClass();
                    textView6 = (TextView) viewFindViewById14;
                    View viewFindViewById15 = viewInflate.findViewById(R.id.game_label);
                    viewFindViewById15.getClass();
                    textView7 = (TextView) viewFindViewById15;
                    View viewFindViewById16 = viewInflate.findViewById(R.id.td_selection_container);
                    viewFindViewById16.getClass();
                    linearLayout = (LinearLayout) viewFindViewById16;
                    View viewFindViewById17 = viewInflate.findViewById(R.id.delayed_settle_icon);
                    viewFindViewById17.getClass();
                    ImageView imageView4 = (ImageView) viewFindViewById17;
                    viewInflate.findViewById(R.id.td_live_betting).setVisibility(i14);
                    viewInflate.findViewById(R.id.match_tracker).setVisibility(i14);
                    viewInflate.findViewById(R.id.td_game_score_tracker_limiter).setVisibility(i14);
                    viewInflate.findViewById(R.id.comments).setVisibility(i14);
                    str2 = str8;
                    viewInflate.findViewById(R.id.td_bottom_line).setVisibility(0);
                    textView3.setVisibility(i14);
                    imageView3.setImageDrawable(null);
                    imageView3.setTag(null);
                    textView6.setVisibility(i14);
                    textView7.setVisibility(i14);
                    textView7.setTypeface(textView7.getTypeface(), 0);
                    textView7.setTextColor(textView7.getContext().getColor(R.color.text_type2_tertiary));
                    sb = new StringBuilder();
                    if (!TextUtils.isEmpty(rSelection2.gameId)) {
                        sb.append(sn5.c(textView4, R.string.bet_history__game_id_vid, rSelection2.gameId));
                        sb.append(" | ");
                    }
                    if (rSelection2.isOngoing()) {
                        textView3.setVisibility(0);
                        mfb0VarE3 = lfb0.d().e(rSelection2.sportId);
                        if (mfb0VarE3 == null) {
                            strF = str2;
                        } else {
                            strF = mfb0VarE3.f(rSelection2.playedSeconds, rSelection2.remainingTimeInPeriod, rSelection2.matchStatus);
                        }
                        strD = strF;
                        view = viewInflate;
                    } else {
                        it = it;
                        view = viewInflate;
                        strD = bwf0Var.d(rSelection2.startTime, false);
                    }
                    if (!TextUtils.isEmpty(strD)) {
                        sb.append(strD);
                    }
                    if (TextUtils.isEmpty(sb.toString())) {
                        i4 = 8;
                        textView4.setVisibility(8);
                    } else {
                        i4 = 8;
                        textView4.setVisibility(0);
                        textView4.setText(sb.toString());
                    }
                    if (q980.c(rSelection2)) {
                        i5 = 0;
                    } else {
                        i5 = i4;
                    }
                    imageView4.setVisibility(i5);
                    i6 = rSelection2.eventStatus;
                    i7 = i6 == 0 ? R.drawable.ic_selection_status_not_started : R.drawable.ic_selection_status_not_started;
                    if (i7 == -1) {
                        drawableA = null;
                    } else {
                        drawableA = gr0.a(view.getContext(), i7);
                    }
                    imageView3.setImageDrawable(drawableA);
                    if (b3.U(rSelection2.eventId)) {
                        j7gVar2 = new j7g();
                        if (!TextUtils.isEmpty(rSelection2.home)) {
                            j7gVar2 = new j7g(rSelection2.home);
                            j7gVar2.e(Color.parseColor("#9ca0ab"), " v ");
                            j7gVar2.a(rSelection2.away);
                        }
                        textView5.setText(j7gVar2);
                    } else {
                        pickMarketMetadata2 = rSelection2.pickMarketMetadata;
                        if (pickMarketMetadata2 != null) {
                            marketHeadline2 = pickMarketMetadata2.getMarketHeadline();
                        } else {
                            marketHeadline2 = null;
                        }
                        if (marketHeadline2 != null) {
                            j7gVar2 = new j7g();
                            if (!TextUtils.isEmpty(rSelection2.home)) {
                                j7gVar2 = new j7g(rSelection2.home);
                                j7gVar2.e(Color.parseColor("#9ca0ab"), " v ");
                                j7gVar2.a(rSelection2.away);
                            }
                            textView5.setText(j7gVar2);
                        } else {
                            j7gVar2 = new j7g();
                            if (!TextUtils.isEmpty(rSelection2.home)) {
                                j7gVar2 = new j7g(rSelection2.home);
                                j7gVar2.e(Color.parseColor("#9ca0ab"), " v ");
                                j7gVar2.a(rSelection2.away);
                            }
                            textView5.setText(j7gVar2);
                        }
                    }
                    if (!rSelection2.isVoid()) {
                        i8 = rSelection2.eventStatus;
                        if (i8 != 1) {
                        }
                        textView7.setVisibility(0);
                        textView7.setText(sn5.c(textView7, R.string.bet_history__live_score, new Object[0]));
                        mfb0VarE2 = lfb0.d().e(rSelection2.sportId);
                        arrayList = new ArrayList();
                        if (mfb0VarE2 != null) {
                            arrayList.addAll(mfb0VarE2.A(rSelection2.setScore, null, null));
                        }
                        textView6.setVisibility(0);
                        if (arrayList.isEmpty()) {
                            j7gVar3 = new j7g();
                            if (arrayList.size() == 2) {
                                j7gVar3.a((CharSequence) arrayList.get(0));
                                j7gVar3.a(":");
                                j7gVar3.a((CharSequence) arrayList.get(1));
                            } else {
                                j7gVar3.d((CharSequence) arrayList.get(0), true);
                                j7gVar3.d(":", true);
                                j7gVar3.d((CharSequence) arrayList.get(1), true);
                                while (i9 < arrayList.size()) {
                                    j7gVar3.a("  ");
                                    j7gVar3.a((CharSequence) arrayList.get(i9));
                                    j7gVar3.a(":");
                                    j7gVar3.a((CharSequence) arrayList.get(i9 + 1));
                                }
                            }
                            textView6.setText(j7gVar3);
                        } else {
                            textView6.setText(sn5.c(textView6, R.string.app_common__na, new Object[0]));
                        }
                        linearLayout.removeAllViews();
                        if (rSelection2.isBetBuilder()) {
                            g880.b(rSelection2, linearLayout);
                            size2 = rSelection2.betBuilderSelections.size();
                            i10 = 0;
                            while (i10 < size2) {
                                if (i10 == rSelection2.betBuilderSelections.size() - 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                RSelection rSelection8 = rSelection2.betBuilderSelections.get(i10);
                                rSelection8.getClass();
                                RSelection rSelection9 = rSelection2;
                                g880.c(rSelection8, linearLayout, null, rSelection9, z3, true);
                                i10++;
                                rSelection2 = rSelection9;
                            }
                        } else {
                            g880.c(rSelection2, linearLayout, null, null, false, true);
                        }
                        g880.a(rSelection2, linearLayout);
                        linearLayout2.addView(view);
                        i14 = i4;
                        str8 = str2;
                        it = it;
                    }
                    linearLayout.removeAllViews();
                    if (rSelection2.isBetBuilder()) {
                        g880.b(rSelection2, linearLayout);
                        size2 = rSelection2.betBuilderSelections.size();
                        i10 = 0;
                        while (i10 < size2) {
                            if (i10 == rSelection2.betBuilderSelections.size() - 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            RSelection rSelection10 = rSelection2.betBuilderSelections.get(i10);
                            rSelection10.getClass();
                            RSelection rSelection11 = rSelection2;
                            g880.c(rSelection10, linearLayout, null, rSelection11, z3, true);
                            i10++;
                            rSelection2 = rSelection11;
                        }
                    } else {
                        g880.c(rSelection2, linearLayout, null, null, false, true);
                    }
                    g880.a(rSelection2, linearLayout);
                    linearLayout2.addView(view);
                    i14 = i4;
                    str8 = str2;
                    it = it;
                }
            }
        } else {
            list.getClass();
            if (!list.isEmpty()) {
                linearLayout2.removeAllViews();
                j7gVar = new j7g();
                size = list.size();
                while (i < size) {
                    rSelection = list.get(i);
                    View viewInflate3 = LayoutInflater.from(e()).inflate(R.layout.spr_bet_share_item, (ViewGroup) null);
                    TextView textView111 = (TextView) viewInflate3.findViewById(R.id.game);
                    TextView textView112 = (TextView) viewInflate3.findViewById(R.id.odds);
                    textView2 = (TextView) viewInflate3.findViewById(R.id.teamname);
                    TextView textView113 = (TextView) viewInflate3.findViewById(R.id.market);
                    View viewFindViewById18 = viewInflate3.findViewById(R.id.diver_line);
                    if (i == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    viewFindViewById18.setVisibility(i2);
                    textView111.setText(rSelection.outcomeDesc);
                    mfb0VarE = lfb0.d().e(rSelection.sportId);
                    if (mfb0VarE != null) {
                        drawableMutate = null;
                    } else {
                        drawableMutate = null;
                    }
                    textView111.setCompoundDrawablesWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView111.setCompoundDrawablePadding(zch0.b(e().getResources(), 10));
                    String str12 = rSelection.odds;
                    str12.getClass();
                    textView112.setText(gky.a.a(str12, false));
                    if (b3.U(rSelection.eventId)) {
                        j7gVar.clear();
                        j7gVar.a(rSelection.home);
                        j7gVar.e(Color.parseColor("#8b8e9b"), " vs ");
                        j7gVar.a(rSelection.away);
                        textView2.setText(j7gVar);
                    } else {
                        pickMarketMetadata = rSelection.pickMarketMetadata;
                        if (pickMarketMetadata != null) {
                            marketHeadline = pickMarketMetadata.getMarketHeadline();
                        } else {
                            marketHeadline = null;
                        }
                        if (marketHeadline != null) {
                            j7gVar.clear();
                            j7gVar.a(rSelection.home);
                            j7gVar.e(Color.parseColor("#8b8e9b"), " vs ");
                            j7gVar.a(rSelection.away);
                            textView2.setText(j7gVar);
                        } else {
                            j7gVar.clear();
                            j7gVar.a(rSelection.home);
                            j7gVar.e(Color.parseColor("#8b8e9b"), " vs ");
                            j7gVar.a(rSelection.away);
                            textView2.setText(j7gVar);
                        }
                    }
                    textView113.setText(e.d(rSelection.marketId, rSelection.specifier, rSelection.marketDesc));
                    linearLayout2.addView(viewInflate3);
                }
            }
        }
        return Unit.a;
    }
}
