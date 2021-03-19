package fr.oupsi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    EpsiActivity activity;
    ArrayList<Student> students;

    public StudentAdapter(EpsiActivity activity, ArrayList<Student> students){
        this.activity=activity;
        this.students=students;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewFirstName;
        private final View layoutCellStudent;


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textViewFirstName = view.findViewById(R.id.textViewFirstName);
            layoutCellStudent = view.findViewById(R.id.layoutCellStudent);

        }

        public TextView getTextViewFirstName() {
            return textViewFirstName;
        }

        public View getLayoutCellStudent() {
            return layoutCellStudent;
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_student, viewGroup, false);

        return new StudentAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        final Student student=students.get(position);
        holder.getTextViewFirstName().setText(student.getFirstName());
        holder.getLayoutCellStudent().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentActivity.displayActivity(activity, student.getFirstName());
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
