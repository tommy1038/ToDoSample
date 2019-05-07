package com.lifeistech.android.todosample;

import io.realm.RealmObject;

public class RealmMemo extends RealmObject {

    // タイトル
    public String title;
    // 日付
    public String updateDate;
    // 内容
    public String content;

    //チェックボックス(完了かどうか)
    public Boolean isChecked;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

