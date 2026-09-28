package org.soccerarena.auth;

import android.app.*;
import android.content.*;
import android.graphics.Color;
import android.os.*;
import android.text.InputType;
import android.view.*;
import android.widget.*;
import org.json.*;

/** In-package account UI, backed by the existing SoccerArena API. */
public final class AccountActivity extends Activity {
    LinearLayout panel;
    TextView status;
    boolean busy, resumeContent, tv;
    String supportEmail = "akilainnocent@pm.me", paymentPhone = "255629645877";
    interface Work { void run() throws Exception; }
    interface Result { void run(); }
    @Override public void onCreate(Bundle saved) {
        super.onCreate(saved);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        resumeContent = getIntent().getBooleanExtra("continue",false);
        tv = getIntent().getBooleanExtra("tv",false);
        home();
        Gate.IO.execute(() -> {
            try {
                JSONObject s=Gate.request("GET","settings/",null,false);
                getSharedPreferences("arena_contacts",0).edit().putString("email",s.getString("support_email")).putString("phone",s.getString("payment_phone")).apply();
            } catch(Exception ignored) {}
        });
        if (Gate.account != null || !getSharedPreferences("arena_session",0).getString("token", "").isEmpty())
            work(() -> Gate.verify(), () -> { if(resumeContent && Gate.valid()) launch(); else home(); });
    }
    @Override protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent); setIntent(intent);
        resumeContent=intent.getBooleanExtra("continue",false); tv=intent.getBooleanExtra("tv",false);
        home();
        if (!busy && resumeContent) work(() -> Gate.verify(), () -> { if(Gate.valid()) launch(); else home(); });
    }
    @Override protected void onResume() {
        super.onResume();
        supportEmail=getSharedPreferences("arena_contacts",0).getString("email",supportEmail);
        paymentPhone=getSharedPreferences("arena_contacts",0).getString("phone",paymentPhone);
    }
    void layout(String title) {
        ScrollView scroll=new ScrollView(this); scroll.setFillViewport(true);
        panel=new LinearLayout(this); panel.setOrientation(LinearLayout.VERTICAL);
        int p=(int)(24*getResources().getDisplayMetrics().density); panel.setPadding(p,p,p,p);
        panel.setBackgroundColor(Color.rgb(12,22,34)); scroll.addView(panel); setContentView(scroll);
        text("SOCCERARENA",28); text(title,20);
        status=text("",15); status.setTextColor(Color.rgb(255,210,115));
    }
    TextView text(String value,int size) {
        TextView t=new TextView(this); t.setText(value); t.setTextSize(size); t.setTextColor(Color.WHITE);
        t.setPadding(0,12,0,12); panel.addView(t); return t;
    }
    EditText input(String hint,boolean password) {
        EditText e=new EditText(this); e.setHint(hint); e.setTextColor(Color.WHITE); e.setHintTextColor(Color.LTGRAY);
        e.setSingleLine(true); e.setInputType(password ? InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD : InputType.TYPE_CLASS_TEXT);
        if(password) { e.setSaveEnabled(false); if(Build.VERSION.SDK_INT>=26)e.setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_NO); }
        panel.addView(e); return e;
    }
    void button(String label,Result action) {
        Button b=new Button(this); b.setText(label); panel.addView(b); b.setOnClickListener(v -> { if(!busy) action.run(); });
    }
    void work(Work action,Result after) {
        if(busy)return; busy=true; status.setText("Please wait…");
        Gate.IO.execute(() -> {
            try { action.run(); runOnUiThread(() -> { busy=false; if(!isFinishing()&&!isDestroyed()) { status.setText(""); after.run(); } }); }
            catch(Exception e) { String m=Gate.message(e); runOnUiThread(() -> { busy=false; if(!isFinishing()&&!isDestroyed()) { if(Gate.account==null && e instanceof Gate.ApiError && ((Gate.ApiError)e).status==401) login(); status.setText(m); } }); }
        });
    }
    void home() {
        if(Gate.account==null) { login(); return; }
        layout("Your account");
        JSONObject a=Gate.account, ent=a.optJSONObject("entitlement");
        text(a.optString("full_name",a.optString("username")),22);
        text(a.optString("username")+"\n"+a.optString("email")+"\n"+a.optString("phone"),16);
        if(ent!=null) {
            text("Access: "+ent.optString("status").replace('_',' '),18);
            if(!ent.isNull("expires_at"))text("Expires: "+ent.optString("expires_at")+" (UTC)",15);
            if(!ent.optString("reason").isEmpty())text(ent.optString("reason"),16);
        }
        if(!Gate.notice.isEmpty())status.setText(Gate.notice);
        button("Continue to channels", () -> work(() -> Gate.verify(), () -> { if(Gate.valid())launch(); else home(); }));
        button("Renew / contact support", () -> contacts());
        button("Payment history", () -> payments(1));
        button("Refresh account", () -> work(() -> { Gate.account=Gate.authRequest("GET","me/",null); Gate.verify(); }, () -> home()));
        button("Log out of all devices", () -> work(() -> { Gate.authRequest("POST","auth/logout/",new JSONObject()); Gate.clear(); }, () -> { Gate.revoke("Signed out."); login(); }));
        button("Delete my account", () -> deletion());
    }
    void login() {
        layout("Sign in"); text("Sign in to watch. Your seven-day trial starts with your first successful login.",16);
        EditText user=input("Username",false), password=input("Password",true);
        button("Sign in", () -> { String u=user.getText().toString().trim(), p=password.getText().toString(); password.setText("");
            work(() -> Gate.login(u,p), () -> { if(Gate.valid())launch(); else home(); }); });
        button("Create account", () -> register());
        button("Contact support / reset password", () -> contacts());
        if(!Gate.notice.isEmpty())status.setText(Gate.notice);
    }
    void register() {
        layout("Create your account");
        EditText name=input("Full name",false), user=input("Username",false), email=input("Email",false), phone=input("Phone with country code, e.g. +255…",false), pass=input("Password",true), confirm=input("Confirm password",true);
        email.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS); phone.setInputType(InputType.TYPE_CLASS_PHONE);
        button("Create account", () -> {
            final JSONObject body=new JSONObject();
            try { body.put("full_name",name.getText().toString().trim()).put("username",user.getText().toString().trim()).put("email",email.getText().toString().trim()).put("phone",phone.getText().toString().trim()).put("password",pass.getText().toString()).put("password_confirmation",confirm.getText().toString()); }
            catch(Exception e) { return; }
            pass.setText(""); confirm.setText("");
            work(() -> Gate.request("POST","auth/register/",body,false), () -> { login(); status.setText("Account created. Sign in to start your trial."); });
        });
        button("Back to sign in", () -> login());
    }
    void contacts() {
        layout("Renewal and support");
        TextView email=text(supportEmail,18), phone=text(paymentPhone.startsWith("+")?paymentPhone:"+"+paymentPhone,18);
        work(() -> {
            JSONObject s=Gate.request("GET","settings/",null,false);
            supportEmail=s.getString("support_email"); paymentPhone=s.getString("payment_phone");
            getSharedPreferences("arena_contacts",0).edit().putString("email",supportEmail).putString("phone",paymentPhone).apply();
        }, () -> { email.setText(supportEmail); phone.setText(paymentPhone.startsWith("+")?paymentPhone:"+"+paymentPhone); status.setText("Support contacts updated."); });
        // Cached contacts remain available even when the API is unreachable.
        text("Contact support for renewal instructions. Access is extended after your payment is confirmed by the administrator.",16);
        button("Copy support email", () -> { copy(supportEmail); email.setText(supportEmail); });
        button("Copy payment phone", () -> { copy(paymentPhone); phone.setText(paymentPhone); });
        button("Back", () -> home());
    }
    void copy(String value) { ((android.content.ClipboardManager)getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("SoccerArena",value)); Toast.makeText(this,"Copied",Toast.LENGTH_SHORT).show(); }
    void payments(int page) {
        layout("Payment history");
        final JSONObject[] result=new JSONObject[1];
        work(() -> result[0]=Gate.authRequest("GET","payments/?page="+page,null), () -> {
            JSONArray rows=result[0].optJSONArray("results");
            if(rows==null||rows.length()==0)text("No payments recorded.",16);
            else for(int i=0;i<rows.length();i++) {
                JSONObject r=rows.optJSONObject(i); if(r==null)continue;
                text(r.optString("amount")+" "+r.optString("currency")+" — "+(r.optBoolean("confirmed")?"Confirmed":"Pending")+"\nReference: "+r.optString("reference")+"\nPaid: "+r.optString("paid_at")+"\nMonths: "+r.optInt("months"),16);
            }
            if(page>1)button("Previous", () -> payments(page-1));
            if(!result[0].isNull("next"))button("Next", () -> payments(page+1));
            button("Back", () -> home());
        });
    }
    void deletion() {
        layout("Delete account"); text("This permanently deletes your account and payment history. Enter your password to confirm.",16);
        EditText password=input("Password",true);
        button("Permanently delete account", () -> new AlertDialog.Builder(this).setTitle("Delete your account?").setMessage("This cannot be undone.")
            .setNegativeButton("Cancel",null).setPositiveButton("Delete",(d,w) -> {
                String p=password.getText().toString(); password.setText("");
                work(() -> { Gate.authRequest("DELETE","me/",new JSONObject().put("password",p)); Gate.clear(); }, () -> { Gate.revoke("Account deleted."); login(); });
            }).show());
        button("Cancel", () -> home());
    }
    void launch() {
        if(!Gate.valid()) { home(); return; }
        Intent i=new Intent(); i.setClassName(this,tv?Gate.TVHOME:Gate.HOME);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i); finish();
    }
    @Override public void onBackPressed() { if(Gate.valid())super.onBackPressed(); else finishAffinity(); }
}
