package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.AlunoResumidoDTO;
import com.residencia.biblioteca.dto.EmprestimoResumidoDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;

	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}

	public Aluno getAlunoById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public AlunoResumidoDTO getAlunoEmprestimosDto(Integer id) {
		Aluno alunoResponse = alunoRepository.findById(id).orElse(null);

		if (alunoResponse == null) {
			return null;
		}

		AlunoResumidoDTO alunoResumidoDTO = new AlunoResumidoDTO();
		alunoResumidoDTO.setNome(alunoResponse.getNome());
		alunoResumidoDTO.setCpf(alunoResponse.getCpf());

		List<EmprestimoResumidoDTO> listaEmprestimoResDto = new ArrayList<>();

		for (Emprestimo emprestimo : alunoResponse.getEmprestimos()) {
			EmprestimoResumidoDTO emprestimoResDto = new EmprestimoResumidoDTO();
			emprestimoResDto.setDataEmprestimo(emprestimo.getDataEmprestimo());
			emprestimoResDto.setDataEntrega(emprestimo.getDataEntrega());

			LivroResumidoDTO livroResDto = new LivroResumidoDTO();
			if (emprestimo.getLivro() == null) {
				livroResDto.setNomeLivro(null);
			} else {
				livroResDto.setNomeLivro(emprestimo.getLivro().getNomeLivro());
			}

			emprestimoResDto.setLivroResumidoDTO(livroResDto);
			listaEmprestimoResDto.add(emprestimoResDto);
		}

		alunoResumidoDTO.setListaEmprestimoResumidoDTO(listaEmprestimoResDto);

		return alunoResumidoDTO;
	}

	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public Aluno updateAluno(Aluno aluno, Integer id) {
		return alunoRepository.save(aluno);
	}

	public Boolean deleteAluno(Integer id) {
		alunoRepository.deleteById(id);
		Aluno alunoDeletado = alunoRepository.findById(id).orElse(null);
		if (alunoDeletado == null) {
			return true;
		} else {
			return false;
		}
	}
}
