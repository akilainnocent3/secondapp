package com.sportybet.plugin.webcontainer.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public class PopupListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private CharSequence[] items;
    private int layoutId;
    private DialogInterface.OnClickListener onClickListener;
    private DialogInterface popup;

    public PopupListAdapter(Context context, CharSequence[] charSequenceArr, DialogInterface dialogInterface, int i) {
        this.onClickListener = null;
        this.context = context;
        this.items = charSequenceArr;
        this.inflater = LayoutInflater.from(context);
        this.popup = dialogInterface;
        this.layoutId = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.items;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        CharSequence[] charSequenceArr = this.items;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        CharSequence[] charSequenceArr = this.items;
        if (charSequenceArr == null || i < 0 || i >= charSequenceArr.length) {
            return null;
        }
        if (view == null || !(view.getTag() instanceof ViewHolder)) {
            view = this.inflater.inflate(this.layoutId, (ViewGroup) null);
            viewHolder = new ViewHolder(this, 0);
            viewHolder.text = this.items[i];
            view.setTag(viewHolder);
            viewHolder.position = i;
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(viewHolder.text);
        if (i == 0) {
            textView.setBackgroundResource(R.drawable.web_alert_dialog_list_item_top_bg);
        } else if (i == this.items.length - 1) {
            textView.setBackgroundResource(R.drawable.web_alert_dialog_list_item_bottom_bg);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.widget.PopupListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int i2 = view2.getTag() != null ? ((ViewHolder) view2.getTag()).position : 0;
                if (PopupListAdapter.this.onClickListener != null) {
                    PopupListAdapter.this.onClickListener.onClick(PopupListAdapter.this.popup, i2);
                }
                new Handler().postDelayed(new Runnable() { // from class: com.sportybet.plugin.webcontainer.widget.PopupListAdapter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PopupListAdapter.this.popup.dismiss();
                    }
                }, 300L);
            }
        });
        return view;
    }

    public void setOnClickListener(DialogInterface.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public class ViewHolder {
        int position;
        CharSequence text;

        private ViewHolder() {
        }

        public /* synthetic */ ViewHolder(PopupListAdapter popupListAdapter, int i) {
            this();
        }
    }

    public PopupListAdapter(Context context, CharSequence[] charSequenceArr, DialogInterface dialogInterface) {
        this(context, charSequenceArr, dialogInterface, R.layout.web_alert_dialog_list_item);
    }
}
