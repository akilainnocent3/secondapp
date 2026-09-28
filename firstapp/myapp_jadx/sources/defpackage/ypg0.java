package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class ypg0 extends s42<Transaction> {
    public final SimpleDateFormat f;
    public int i;

    /* JADX INFO: loaded from: classes6.dex */
    public class b extends a82 {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.type);
            this.b = (TextView) view.findViewById(R.id.time);
            this.c = (TextView) view.findViewById(R.id.balance);
            this.d = (TextView) view.findViewById(R.id.status);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x015b  */
        @Override // defpackage.a82
        public final void a(int i) {
            String strB;
            ypg0 ypg0Var = ypg0.this;
            Activity activity = ypg0Var.a;
            Transaction transaction = (Transaction) ypg0Var.b.get(i);
            if (transaction == null) {
                return;
            }
            this.a.setText(qqg0.a(transaction.bizType, transaction.tradeCode, transaction.bizTypeName, transaction.subBizTypeName).e(activity));
            this.b.setText(ypg0Var.f.format(new Date(transaction.createTime)));
            long j = ger.a(transaction.tradeCode) ? transaction.initAmount : transaction.amount;
            int i2 = transaction.amountSign;
            TextView textView = this.c;
            if (i2 == 1 && j != 0) {
                textView.setText(sn5.b(activity, R.string.page_transaction__plus_amount, bjb0.U(j, Locale.US)));
                textView.setTextColor(textView.getContext().getColor(R.color.brand_secondary));
            } else if (i2 != 2 || j == 0) {
                textView.setText(bjb0.U(j, Locale.US));
                textView.setTextColor(textView.getContext().getColor(R.color.text_type1_primary));
            } else {
                textView.setText(sn5.b(activity, R.string.page_transaction__neg_amount, bjb0.U(j, Locale.US)));
                textView.setTextColor(textView.getContext().getColor(R.color.text_type1_secondary));
            }
            TextView textView2 = this.d;
            textView2.setVisibility(0);
            int i3 = transaction.status;
            if (i3 != 10) {
                if (i3 == 20) {
                    textView2.setVisibility(8);
                } else if (i3 == 30) {
                    strB = sn5.b(activity, R.string.page_transaction__failed, new Object[0]);
                    textView2.setTextColor(textView.getContext().getColor(R.color.text_type1_secondary));
                } else if (i3 == 90) {
                    strB = sn5.b(activity, R.string.page_transaction__closed, new Object[0]);
                    textView2.setTextColor(textView.getContext().getColor(R.color.text_type1_secondary));
                }
                strB = "";
            } else {
                String strB2 = sn5.b(activity, R.string.page_transaction__pending, new Object[0]);
                textView2.setTextColor(textView.getContext().getColor(R.color.warning_primary));
                if (TextUtils.isEmpty(transaction.auditStatus)) {
                    strB = strB2;
                } else if (transaction.auditStatus.equals("11")) {
                    strB = sn5.b(activity, R.string.page_transaction__withdrawals_blocked, new Object[0]);
                } else if (transaction.auditStatus.equals("12")) {
                    strB = sn5.b(activity, R.string.page_transaction__pending_verification, new Object[0]);
                } else if (transaction.auditStatus.equals("13")) {
                    strB = sn5.b(activity, R.string.page_transaction__verification_failed, new Object[0]);
                } else {
                    strB = strB2;
                }
            }
            textView2.setText(strB);
        }

        @Override // defpackage.a82
        public final void b(int i, View view) {
            ypg0 ypg0Var = ypg0.this;
            Activity activity = ypg0Var.a;
            List<T> list = ypg0Var.b;
            if (i < 0 || i >= list.size()) {
                return;
            }
            Transaction transaction = (Transaction) list.get(i);
            if (TextUtils.isEmpty(transaction.tradeId)) {
                return;
            }
            d8b d8bVar = c1h0.a;
            yrh0.s(activity, c1h0.a(ypg0Var.i, activity, transaction.tradeId), true);
        }
    }

    public ypg0(Activity activity, List<Transaction> list) {
        super(activity, list);
        this.f = new SimpleDateFormat("dd/MM HH:mm:ss", Locale.US);
    }

    @Override // defpackage.s42
    public final int i(int i) {
        return R.layout.spr_transaction_list_item;
    }

    @Override // defpackage.s42
    public final a82 j(ViewGroup viewGroup, int i) {
        if (i == R.layout.spr_transaction_list_item) {
            return new b(dzc.a(viewGroup, i, viewGroup, false));
        }
        if (i == R.layout.spr_manual) {
            return new a(dzc.a(viewGroup, i, viewGroup, false));
        }
        return null;
    }

    public class a extends a82 {
        public final TextView a;

        /* JADX INFO: renamed from: ypg0$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC1359a implements View.OnClickListener {
            public ViewOnClickListenerC1359a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ypg0.this.a.startActivity(new Intent(view.getContext(), (Class<?>) TxFixStatusActivity.class));
            }
        }

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.manual_hint_btn);
        }

        @Override // defpackage.a82
        public final void a(int i) {
            this.a.setOnClickListener(new ViewOnClickListenerC1359a());
        }

        @Override // defpackage.a82
        public final void b(int i, View view) {
        }
    }
}
